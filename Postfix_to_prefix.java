package main;
import java.util.Stack;
public class Postfix_to_prefix {
	
	static boolean isOperator(char c)
	{
		switch(c)
		{
			case '+' :
			case '-' :
			case '*' :
			case '/' :
				return true;
		}
		return false;
	}
	public static String convert(String str)
	{
		Stack<String> stack = new Stack<String>();
		
		int l = str.length();
		
		for(int i=0; i<l; i++)
		{
			char c = str.charAt(i);
			if(isOperator(c))
			{
				String op1 = stack.peek();
				stack.pop();
				String op2 = stack.peek();
				stack.pop();
				
				String temp = c + op2 + op1;
				
				stack.push(temp);
			}
			else
			{
				stack.push(c + "");
			}
		}
		return stack.peek();
	}
	public static void main(String[] args)
	{
		String exp = "ABC/-AK/L-*";
		
		System.out.println("Prefix: " + convert(exp));
	}
}
