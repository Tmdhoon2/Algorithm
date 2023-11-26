class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];

        String[] array = new String[arr1.length];


        for (int i = 0; i < arr1.length; i++) {
            array[i] = getBinary(arr1[i], arr2[i], arr1.length);
        }

        for (int i = 0; i < array.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < array[i].length(); j++) {
                if (array[i].charAt(j) == '1') {
                    sb.append('#');
                } else {
                    sb.append(' ');
                }
            }
            answer[i] = sb.toString();
        }

        return answer;
    }

    public String getBinary(int n1, int n2, int size) {
        String temp = Integer.toBinaryString(n1 | n2);
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= size - temp.length(); i++) {
            sb.append("0");
        }
        sb.append(temp);

        return sb.toString();
    }
}