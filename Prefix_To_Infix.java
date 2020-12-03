package main;
import java.util.Stack;
public class Prefix_To_Infix {
	static boolean check(char x)
	{
		switch(x)
		{
			case '+':
			case '-':
			case '*':
			case '/':
				return true;
		}
		return false;
	}
	 
	public static String pretoinf(String str)
	{
		Stack <String> stack = new Stack<String>();
		
		int l = str.length();
		for(int i=l-1; i>=0; i--)
		{
			char c = str.charAt(i);
			if(check(c))
			{
				String op1 = stack.pop();
				
				String op2 = stack.pop();				
				
				String dup = "(" + op1 + c + op2 + ")";
				stack.push(dup);
			}
			else
			{
				stack.push(c + "");
			}
		}
		return stack.pop();
	}
	public static void main(String[] args)
	{
		String exp = "*+AB-CD";
		System.out.println("Infix: " + pretoinf(exp));
	}
}
