import java.util.*;
public class LinkedList16{
	public static void main(String[] args){
	LinkedList<Character> l1=new LinkedList<Character>();
	l1.add('r');
	l1.add('a');
	l1.add('d');
	l1.add('a');
	l1.add('r');
	l1.add('f');
	Stack<Character> s=new Stack<Character>();
	for(int i=0;i<l1.size();i++){s.push(l1.get(i));}System.out.println(s);
	for(int i=0;i<l1.size();i++){if(s.pop()==l1.get(i))System.out.println("yes its a palindrome");else System.out.println("not a palindrome");}
	}
}