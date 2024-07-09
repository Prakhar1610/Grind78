package Stacks;

import java.util.Stack;

public class EvaluateReversePolishNotation 
{
	class Solution 
	{
	    public int evalRPN(String[] tokens) 
	    {
	        Stack<Integer> s = new Stack<>();
	        int num1=0;
	        int num2=0;
	        int op=0;
	        for(int i=0 ; i<tokens.length ; i++)
	        {      
	            switch(tokens[i])
	            {
	                case "+":
	                num1 = s.pop();
	                num2 = s.pop();
	                op = num2 + num1;
	                s.push(op);
	                break;

	                case "-":
	                num1 = s.pop();
	                num2 = s.pop();
	                op = num2 - num1;
	                s.push(op);
	                break;

	                case "*":
	                num1 = s.pop();
	                num2 = s.pop();
	                op = num2 * num1;
	                s.push(op);
	                break;

	                case "/":
	                num1 = s.pop();
	                num2 = s.pop();
	                op = num2 / num1;
	                s.push(op);
	                break;

	                default:
	                s.push(Integer.parseInt(tokens[i]));
	            }


	            // if(tokens[i].equals("+"))
	            // {
	            //     num1 = s.pop();
	            //     num2 = s.pop();
	            //     op = num2 + num1;
	            //     s.push(op); 
	            // }
	            // else if(tokens[i].equals("-"))
	            // {
	            //     num1 = s.pop();
	            //     num2 = s.pop();
	            //     op = num2 - num1;
	            //     s.push(op); 
	            // }
	            // else if(tokens[i].equals("*"))
	            // {
	            //     num1 = s.pop();
	            //     num2 = s.pop();
	            //     op = num2 * num1;
	            //     s.push(op); 
	            // }
	            // else if(tokens[i].equals("/"))
	            // {
	            //     num1 = s.pop();
	            //     num2 = s.pop();
	            //     op = num2 / num1;
	            //     s.push(op); 
	            // }
	            // else
	            //     s.push(Integer.parseInt(tokens[i]));
	        }
	        return s.pop();
	    }
	}
}
