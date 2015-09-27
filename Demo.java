import java.util.*;
public class Demo{
	public static void main(String[] args){
	Stack<Integer> st=new Stack<Integer>();
	st.push(50);
	st.push(6);
	st.push(58);
	st.push(87);
	System.out.println(st);
	System.out.println(st.search(50));
	}
}