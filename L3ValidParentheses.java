/*
Valid Parentheses :-
Input: s = "()"
Output: true

Algorithm :-
1. create the new stack
2. retrieve the string in the form of array
3. check for open parenthesis or braces or brackets
4. if it is true then push to the stack
5. if it is false then check for the open parenthesis and continue or else check for empty and not open parenthesis and return false
6. Atlast check for empty stack and return the result

*/

import java.util.Stack;

public class L3ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        //System.out.println("ques:" + s);

        for(char c: s.toCharArray()) {
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else if(c == ')' || c == '}' || c == ']') {
               
                if(stack.isEmpty()) {

                    return false;
                }
                char top = stack.pop();
                if(c == ')' && top != '(') {
                    return false;
                }else if(c == '}'  && top != '{') {
                    return false;
                }else if(c == ']' && top != '[') {
                    return false;
                }

               
            }
        }

        return stack.isEmpty();
    }


    public static void main(String[] args){
        String s = "()";

        boolean validateParentheses = isValid(s);
        System.out.println("The string validation is: " + validateParentheses);


    }
}
