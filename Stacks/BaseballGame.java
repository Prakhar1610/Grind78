package Stacks;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame
{
	class Solution 
	{
	   public int calPoints(String[] operations) 
	    {
	        List<Integer> stack = new ArrayList<>();
	         for(int i=0 ; i<operations.length ; i++)
	         {
	            int n1 = 0;
	            int n2 = 0;
	            int sum = 0;
	            int twice = 0;

	            switch(operations[i])
	            {
	                case "+":
	                  n1 = stack.remove(stack.size() - 1);
	                  n2 = stack.remove(stack.size() - 1);
	                  sum = n2 + n1;
	                  stack.add(n2);
	                  stack.add(n1);
	                  stack.add(sum);
	                  break;

	                case "D":
	                  n1 = stack.remove(stack.size() - 1);
	                  twice = n1 * 2;
	                  stack.add(n1);
	                  stack.add(twice);
	                  break;

	                case "C":
	                  stack.remove(stack.size() - 1);
	                  break;

	                default:
	                  stack.add(Integer.parseInt(operations[i]));
	            }
	         }
	         int sum = 0;
	         for(int i=0 ; i<stack.size() ; i++)
	             sum = sum + stack.get(i);

	        return sum;
	    }
	}
}
//import java.util.ArrayList;
//import java.util.List;
//
//class Stack
//{
//    List<Integer> stack = new ArrayList<>();
//
//    void push(int data)
//    {
//        stack.add(data);
//    }
//
//    int pop()
//    {
//        int ele = stack.get(stack.size() - 1);
//        stack.remove(stack.size() - 1);
//        return ele;
//    }
//
//    int peek()
//    {
//        return stack.get(stack.size() - 1);
//    }
//
//    boolean noElement()
//    {
//        if(stack.isEmpty())
//          return true;
//        else
//          return false;
//    }
//
//}
// 
//public class BaseballGame
//{
//	public static int calPoints(String[] operations) 
//    {
//        Stack s = new Stack();
//        int num1;
//        int num2;
//        for(int i=0 ; i<operations.length ; i++)
//        {
//            String data = operations[i];
//            switch(data)
//            {
//                case "+":
//                    num1 = s.pop();
//                    num2 = s.pop();
//                    int sum = num1 + num2;
//                    s.push(num1);
//                    s.push(num2);
//                    s.push(sum);
//                    break;
//
//                case "D":
//                    num1 = s.pop();
//                    int twice = num1 * 2;
//                    s.push(num1);
//                    s.push(twice);
//                    break;
//
//                case "C":
//                    num2 = s.pop();
//                    break;
//
//                default :
//                    s.push(Integer.parseInt(data));        
//            }
//        }
//        int total = 0;
//        while(s.noElement())
//            total = total + s.pop();
//
//        return total;
//
//    }
//	
//	public static void main(String[] args)
//	{
//		String[] operations = {"5","2","C","D","+"};
//		System.out.println(calPoints(operations) );
//	}
//}
