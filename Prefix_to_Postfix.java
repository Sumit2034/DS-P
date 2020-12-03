package main;
import java.util.Stack;
public class Prefix_to_Postfix {

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
		
		for(int i=l-1; i>=0; i--)
		{
			char c = str.charAt(i);
			if(isOperator(c))
			{
				String op1 = stack.peek();
				stack.pop();
				String op2 = stack.peek();
				stack.pop();
				
				String temp = op1 + op2 + c ;
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
		String exp = "*-A/BC-/AKL";
		System.out.println("Postfix: " + convert(exp));
	}
}
