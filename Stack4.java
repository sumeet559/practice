import java.util.*;
public class Stack1{
	public static void main(String[] args)
	{
	String str="hello";
	Stack<Character> s=new Stack<Character>();
	for(int i=0;i<str.length();i++){s.push(str.charAt(i));}
	System.out.println(s);
	while(!s.isEmpty())
	System.out.println(s.pop());
	}
}