class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int index = 0;
        int[] array = new int[3];
        for(int i = 0; i<dartResult.length(); i++) {
            try {
                String string = String.valueOf(dartResult.charAt(i));
                int number = Integer.parseInt(string);
                
                if (number != 0) {
                    if (number == 1 && dartResult.charAt(i + 1) == '0') {
                        array[index] = 10;
                        index -= 1;
                    } else {
                        array[index] = number;
                    }
                    index++;
                } else {
                    if (i >= 1) {
                        if (dartResult.charAt(i - 1) != '1') {
                            array[index] = 0;
                        }
                    }
                    index++;
                }
            } catch (NumberFormatException e) {
                //try {
                //System.out.println(index);
                char command = dartResult.charAt(i);
                int prev = array[index - 1];
                
                switch(command) {
                    case 'D' : {
                        array[index - 1] = prev * prev;
                        break;
                    }
                        
                    case 'T' : {
                        array[index - 1] = prev * prev * prev;
                        break;
                    }
                        
                    case '*' : {
                        array[index - 1] = prev * 2;
                        if (index >= 2) {
                            array[index - 2] = array[index - 2] * 2;
                        }
                        break;
                    }
                        
                    case '#' : {
                        array[index - 1] = prev * -1;
                        break;
                    }
                }
                //} catch (ArrayIndexOutOfBoundsException e1) {
                    
                //}
            }
        }
        
        for(int i = 0; i<3; i++) {
            answer += array[i];
            //System.out.println(array[i]);
        }
        
        return answer;
    }
}