package main;

import java.util.Stack;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        int brackets = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
            } else if (ch == ']') {
                brackets--;
            }
            if (brackets < 0) { return false; }
        }
        return brackets == 0;
    }


//        public static boolean tryBalancedBrackets(String input) {
//            if (input == null || input.isEmpty()) {
//                return true;
//            }
//
//            Stack<Character> stack = new Stack<>();
//            for (int i = 0; i < input.length(); i++) {
//                char c = input.charAt(i);
//                if (c == '[') {
//                    stack.push(c);
//                } else if (c == ']') {
//                    if (stack.isEmpty()) {
//                        return false;
//                    }
//                    char top = stack.pop();
//                    if (c == ']' && top != '[') {
//                        return false;
//                    }
//                }
//            }
//            return stack.isEmpty();
//        }


//    public static boolean isBalanced(Object o) {
//        return true;
//    }
}
