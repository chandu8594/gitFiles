package com.chandu.validParentheses;

import java.util.Stack;

public class ValidParentheses {
	private boolean isValid(char a, char b) {
        return (a=='(' && b==')') || (a=='[' && b==']')
                || (a=='{' && b=='}');
    }

    public boolean isValidParenthses(String str) {
        if (str.length() == 0) {
            return true;
        } else if (str.length() == 1) {
            return false;
        }

        Stack<Character> stk = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if ((curr == '(')
                    || (curr == '{')
                    || (curr == '[')) {
                stk.push(curr);
            }
            else if((curr == ')')
                    || (curr == '}')
                    || (curr == ']')) {
                if(stk.isEmpty() || !isValid(stk.pop(), curr)) {
                    return false;
                }
            }
        }
        if(!stk.isEmpty()) {
            return false;
        }
        return true;
    }
}
