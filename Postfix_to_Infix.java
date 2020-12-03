package main;
import java.util.Stack;
public class Postfix_to_Infix {
	static boolean isOperands(char c)
	{
		if((c>='a' && c<='z') || (c>='A' && c<='Z') )
		{
			return true;
		}
		else
			return false;
	}
	public static String convert(String str)
	{
		int l = str.length();
		Stack<String> stack = new Stack<String>();
		
		for(int i=0; i<l; i++)
		{
			char c = str.charAt(i);
			
			if(isOperands(c))
			{
				stack.push( c + "");
			}
			else
			{
				String op1 = stack.peek();
				stack.pop();
				String op2 = stack.peek();
				stack.pop();
				
				String temp = "(" + op2 + c + op1 + ")";
				stack.push(temp);
			}
		}
		return stack.peek();
	}
	
	public static void main(String[] args)
	{
		String exp = "abc++";
		System.out.println("Infix: " + convert(exp));
	}
}
