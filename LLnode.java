public class LLnode
{
	public int data;
	public LLnode next;
public LLnode(int data){
	this.data=data;
	this.next=null;
	}
public void insert_at_front(LLnode head){
	head.next=this;
	}
public void insert_at_back(LLnode head,int data1){
	LLnode node=new LLnode(data1);
	LLnode ptr=head;
	while(ptr.next!=null)ptr=ptr.next;
	node.data=data1;
	ptr.next=node;
	}
/*public void segregate(LLnode head){
	LLnode ptr1=head;
	LLnode ptr2=head;
	LLnode ptr=head;
	LLnode end=head;
	while(end.next!=null){end=end.next;}
	while(ptr1.next!=null)
		{if(ptr1.data%2==0){ptr=ptr1;ptr1=ptr1.next;}
	else{ptr2=ptr1;ptr.next=ptr2.next;ptr2.next=null;end.next=ptr2;end=ptr2;ptr1=ptr1.next;}}
	}*/
public static void main(String[] args){
	LLnode l1=new LLnode(10);
	l1.insert_at_back(l1,55);
	l1.insert_at_back(l1,56);
	l1.insert_at_back(l1,57);
	l1.insert_at_back(l1,58);
	//l1.segregate(l1);
	System.out.println(l1.next.next.data);
	}
}