import java.util.*;
public class Stack6{
	public static int isMatching(char c,char d){
	if( c=='}' && d=='{')
	return 1;
	else if( c==')' &&  d=='(')
	return 1;
	else if( c==']' &&  d=='[')
	return 1;
	else return 0;
	}
	public static void main(String[] args){
	Stack<Character> s=new Stack<Character>();
	String str="[({})]";
	for(int i=0;i<str.length();i++){System.out.println(s);
	if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='(')s.push(str.charAt(i));
	if(str.charAt(i)=='}' || str.charAt(i)==']' || str.charAt(i)==')'){
	int r=isMatching(str.charAt(i),s.pop());
	if(r==1)
	System.out.println(" good set of brackets");
	}
	}
	}
}