package main;
import java.util.Stack;
public class Infix_to_prefix {
	static boolean isOperands(char c)
	{
		if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9'))
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
		Stack <Character> operators = new Stack<Character>();
		
		Stack <String> operands = new Stack<String>();
		
		for(int i=0; i<str.length(); i++)
		{
			
			if(str.charAt(i) == '(')
			{
				operators.push(str.charAt(i));
			}
			
			else if(str.charAt(i)==')')
			{
				while(!operators.isEmpty() && operators.peek() != '(')
				{ 
					String op1 = operands.peek();
					operands.pop();
					
					String op2 = operands.peek();
					operands.pop();
					
					char op = operators.peek();
					operators.pop();
					
					String temp = op + op2 + op1;
					
					operands.push(temp);
				}
				operators.pop();//pop opening bracket
			}
			else if(isOperands(str.charAt(i)))
			{
				operands.push(str.charAt(i) + "");
			}
			
			else
			{
				while(!operators.isEmpty() && priority(str.charAt(i)) <= priority(operators.peek()))
				{
					String op1 = operands.peek();
					operands.pop();
					String op2 = operands.peek();
					operands.pop();
					
					char op = operators.peek();
					operators.pop();
					
					String temp = op + op2 + op1;

					operands.push(temp);
				}
				operators.push(str.charAt(i));
			}
			
		}
		while(!operators.isEmpty())
		{
			String op1 = operands.peek();
			operands.pop();
			String op2 = operands.peek();
			operands.pop();
			
			char op = operators.peek();
			operators.pop();
			
			String temp = op + op2 + op1;

			operands.push(temp);
		}
		return operands.peek();
	}
	public static void main(String[] args)
	{
		String exp = "(A-B/C)*(A/K-L)";
		System.out.println("Prefix: "+ convert(exp));
	}
}
