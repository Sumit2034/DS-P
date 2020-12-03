package main;
import java.util.Stack;
public class Infix_to_Postfix {
	static boolean isOperands(char c)
	{
		if((c>='a' && c<='z') || (c>='A' && c<='Z') )
		{
			return true;
		}
		else
			return false;
	}
	static int priority(char c)
	{
		if(c=='+' || c=='-')
		{
			return 1;
		}
		else if(c=='*' || c=='/')
			return 2;
		else if(c=='^')
			return 3;
		return 0;
	}
	public static String convert(String str)
	{
		Stack<Character> stack = new Stack<Character>();
		
		String result = new String("");
		for(int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			if(isOperands(c))
			{
				result = result + c;
			}
			else if(c == '(')
			{
				stack.push(c);
			}
			else if(c == ')')
			{
				while(!stack.isEmpty() && stack.peek() != '(')
				{
					result = result + stack.pop();
				}
				if(!stack.isEmpty() && stack.peek() != '(')
					return "Invalid expression";
				else
					stack.pop();
			}
			else
			{
				while(!stack.isEmpty() && priority(c) <= priority(stack.peek()))
				{
					if(stack.peek() == '(')
					{
						return "Invalid Expression";
					}
					result = result + stack.pop();
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty())
		{
			if(stack.peek() == '(')
			{
				return "Invalid Expression";
			}
			result = result + stack.pop();
		}
		return result;
	}
	public static void main(String[] args)
	{
		String exp = "a+b*(c^d-e)^(f+g*h)-i";
		System.out.println("Postfix: " + convert(exp));
	}
}
