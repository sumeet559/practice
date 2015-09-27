public class LLdemo{
	private int data;
	private LLdemo next;
public LLdemo(int data,LLdemo next){
	this.data=data;
	this.next=next;
}
public static void main(String[] args){
	LLdemo l1=new LLdemo(24,null);
	System.out.println(l1.data+" ");
	LLdemo l2=new LLdemo(77,l1);
	LLdemo l3=new LLdemo(78,l2);
	LLdemo l4=new LLdemo(74,l3);
	LLdemo l5=new LLdemo(79,l4);
	LLdemo l6=new LLdemo(71,l5);
	System.out.println(l6.data+" ");
	System.out.println(l2.data+" ");
	System.out.println(l3.data+" ");
	System.out.println(l4.data+" ");
}
}
