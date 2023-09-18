class Solution {
    boolean solution(String s) {
        int leftExpected = 0;
        int rightExpected = 0;

        if(s.charAt(s.length() - 1) == '(') return false;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
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