public class LListNode
{
	public int data;
	public LListNode arb;
	public LListNode next;
public LListNode(int data)
	{
	this.data=data;
	this.arb=null;
	this.next=null;
	}
public void setnext(LListNode node){
	this.next=node;
	}
public void setarb(LListNode root){
	LListNode prev=root;
	LListNode next1=root.next;
	while(next1!=null){
	if(prev.data < next1.data){
	prev.arb=next1;
	prev=next1;
	next1=next1.next;
	}
	else next1=next1.next;
	}
	}
public static void main(String[] args){
	LListNode n=new LListNode(10);
	LListNode n1=new LListNode(100);
	LListNode n2=new LListNode(1);
	LListNode n3=new LListNode(103);
	LListNode n4=new LListNode(15);
	n.setnext(n1);
	n1.setnext(n2);
	n2.setnext(n3);
	n3.setnext(n4);
	n.setarb(n);
	System.out.println(n.arb.data);
	} 
}