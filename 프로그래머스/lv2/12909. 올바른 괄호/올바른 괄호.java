import java.util.ArrayList;

class Solution {
    boolean solution(String s) {
        ArrayList<Character> arrayList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            arrayList.add(s.charAt(i));
        }

        int leftExpected = 0;
        int rightExpected = 0;

        if(arrayList.get(arrayList.size() - 1) == '(') return false;

        for (int i = 0; i < arrayList.size(); i++) {
            switch (arrayList.get(i)) {
                case '(': {
                    rightExpected += 1;
                    leftExpected -= 1;
                    break;
                }

                case ')': {
                    leftExpected += 1;
                    rightExpected -= 1;
                }
            }

            if(leftExpected > rightExpected) return false;
        }

        if (leftExpected < 0 || rightExpected < 0) {
            return false;
        }

        return true;
    }
}