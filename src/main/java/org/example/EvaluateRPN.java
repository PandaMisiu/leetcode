package org.example;

import java.util.Stack;

public class EvaluateRPN {
    char [] operators = {'+','-','*','/'};
    private boolean isOperator(String token) {
        if (token.length() != 1) return false;
        char c = token.charAt(0);
        for (char op : operators) {
            if (op == c) return true;
        }
        return false;
    }

    private int calculateEquation(int num1, int num2, char op){
        switch (op){
            case '+':
                return num2+num1;
            case '-':
                return num2-num1;
            case '*':
                return num2*num1;
            case '/':
                return num2/num1;
            default:
                return 0;
        }
    }


    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if(isOperator(token)){
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(calculateEquation(num1,num2,token.charAt(0)));
            }
            else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
