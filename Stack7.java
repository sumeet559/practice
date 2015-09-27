import java.util.*;
public class Stack7{
	public static void main(String[] args){
	Stack<Integer> st=new Stack<Integer>();
	int[] arr={11,9,8,12};
	st.push(arr[0]);
	for(int i=1;i<4;i++){
		int e=st.pop();
		int next=arr[i];
		while(next>e){
			System.out.println(e+"-->"+next);
			if(!st.empty()){e=st.pop();}else break;
		}
		if(next<e)st.push(e);
		st.push(next);
	}
	while(!st.empty()){System.out.println(st.pop()+"--> -1");}
	}
}