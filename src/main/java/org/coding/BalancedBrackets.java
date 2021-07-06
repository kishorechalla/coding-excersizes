package org.coding;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * This class uses Java deque instead of stack. Below are some of the resources for comparing stack and dequeue
 * https://www.baeldung.com/java-deque-vs-stack
 * https://stackoverflow.com/questions/12524826/why-should-i-use-deque-over-stack
 */
public class BalancedBrackets {

    /**
     * This method will take a string an argument and determine if the string has balanced brackets or not
     * EX: [{()}] is a balanced string and {[}] is not.
     *
     * @param expression - string value
     * @return - weather a string is balanced or not
     */
    public boolean isBalanced(String expression) {
        // check edge cases
        if (expression == null || expression.length() == 1) {
            return false;
        }
        // create a stack
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            // push to stack if it's an open bracket
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                // there has to be a open bracket in the stack
                if (stack.isEmpty()) {
                    return false;
                }
                // check if the last pushed bracket matches current closed bracket
                char popChar = stack.pop();
                if (popChar == '{' && c != '}') {
                    return false;
                }
                if (popChar == '[' && c != ']') {
                    return false;
                }
                if (popChar == '(' && c != ')') {
                    return false;
                }
            }
            // ignore if the character is not any of the open or close brackets
        }
        return stack.isEmpty();
    }
}
