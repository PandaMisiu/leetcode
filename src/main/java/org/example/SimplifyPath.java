package org.example;

import java.util.Objects;
import java.util.Stack;

public class SimplifyPath {
    public static String simplifyPath(String path) {
        StringBuilder builder = new StringBuilder();
        char prev = path.charAt(0);
        builder.append(prev);

        for (int i = 1; i < path.length(); i++) {
            char curr = path.charAt(i);
            if (prev == '/' && curr == '/') {
                continue;
            }
            builder.append(curr);
            prev = curr;
        }

        String correctedPath = builder.toString();

        String [] words = correctedPath.split("/");

        Stack<String> stack = new Stack<>();
        for(String word : words){
            if(Objects.equals(word, "..")){
                if(!stack.isEmpty())
                    stack.pop();
            } else if(!Objects.equals(word, ".") && !word.isBlank()){
                stack.push(word);
            }
        }

        builder.setLength(0);

        if(stack.isEmpty()) return "/";
        for(String word : stack){
            builder.append("/");
            builder.append(word);
        }

        return builder.toString();
    }
}
