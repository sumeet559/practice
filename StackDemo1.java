public class StackDemo1{
private int size;
private int[] arr;
private int top;

public StackDemo1(int s){
	size=s;
	arr=new int[size];
	top=-1;
}
public void push(int n){
	arr[++top]=n;
}
public int pop(){
return arr[top--];
}
	public static void main(String[] args){
		StackDemo1 s=new StackDemo1(5);
		s.push(89);
		s.push(100);
		s.push(87);
		s.push(56);
		System.out.println(s+" ");
		System.out.println(s.pop());
	}

}