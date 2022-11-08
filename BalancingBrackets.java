package com.assignment.lab3.gl;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBrackets {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter the input String");
        String input = sc.next();
        isBalanced(input);
        sc.close();
    }

    public static void isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c=='{' || c=='['){
                stack.push(c);
            } else {
                char top = stack.peek();
                if ((top == '(' && c ==')') || (top == '{' && c =='}') || (top == '[' && c ==']')){
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()){
            System.out.println("The entered String has Balanced Brackets");
        } else {
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }
    }
    
}
