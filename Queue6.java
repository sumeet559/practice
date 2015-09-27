import java.util.*;
public class Queue6{
public static void enqueue(Stack<Integer> s1,int data){
	s1.add(data);
}
public static int dequeue(Stack<Integer> s1,Stack<Integer> s2){
	while(!s1.isEmpty()){s2.add(s1.pop());}
	int r=s2.pop();
	while(!s2.isEmpty()){s1.add(s2.pop());}
	return r;
}
public static void main(String[] args){
	Stack<Integer> stack1=new Stack<Integer>();
	Stack<Integer> stack2=new Stack<Integer>();
	enqueue(stack1,56);
	enqueue(stack1,78);
	enqueue(stack1,5);
	System.out.println(dequeue(stack1,stack2)+" ");
}
}