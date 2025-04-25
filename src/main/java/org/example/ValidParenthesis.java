package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<s.length();i++){
            char curr = s.charAt(i);
            if(curr == '(' || curr == '{' || curr=='[') stack.push(curr);
            else {
                if(stack.isEmpty()) return false;

                char leftPar = stack.pop();
                if(map.get(leftPar) != curr) return false;
            }
        }

        if(!stack.isEmpty()) return false;
        return true;
    }
}
