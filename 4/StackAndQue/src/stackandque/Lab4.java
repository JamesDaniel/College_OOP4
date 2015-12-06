/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stackandque;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author t00126681
 */
public class Lab4 {
    public static boolean isBalanced(String expression)
    {
        int index = 0;
        Deque<Character> stack = new LinkedList();
        boolean balance = true;
        
        while (balance && index < expression.length()) {
            char nextCharacter = expression.charAt(index);

            if (isOpen(nextCharacter)) {
                stack.addFirst(nextCharacter);
            } else if (isClose(nextCharacter)) {
                if (stack.isEmpty()) {
                    balance = false;
                } else {
                    char firstItem = stack.removeFirst();
                    if (!areMatching(firstItem, nextCharacter))//added top this line for  special brackets
                    {
                        balance = false;
                    }
                }
            }
//                stack.removeFirst();
//            
//            if (stack.size() == 0 || stack.peek() != expression.charAt(index))
//                return false;   // is this right?

            index++;

        }
        return balance && stack.isEmpty() ? true : false;
    }
    private static boolean isOpen(char ch)
    {
        if (ch == '(' ||
            ch == '{' ||
            ch == '[' ||
            ch == '<')
            return true;
            
        return false;
    }
    private static boolean isClose(char ch)
    {
        if (ch == ')' ||
            ch == '}' ||
            ch == ']' ||
            ch == '>')
            return true;
            
        return false;
    }
    private static boolean areMatching(char c1, char c2)
    {
        if (c1 == '(' && c2 == ')')
            return true;
        if (c1 == '{' && c2 == '}')
            return true;
        if (c1 == '[' && c2 == ']')
            return true;
        if (c1 == '<' && c2 == '>')
            return true;
        
        
        return false;
    }
}
