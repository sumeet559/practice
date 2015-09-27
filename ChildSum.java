public class ChildSum
{
	public int data;
	 public ChildSum left;
	public ChildSum right;
public ChildSum(int data){
	this.data=data;
	this.left=null;
	this.right=null;
	}
public void addleft(ChildSum node){
	this.left=node;
	}
public void addright(ChildSum node){
	this.right=right;
	}
public int child(ChildSum root){
	if(root==null || root.left==null && root.right==null)return 1;else{
	if(root.data== root.left.data + root.right.data && child(root.left)==1 && child(root.right)==1)return 1;
	else return 0;}
	}
public static void main(String[] args){
	ChildSum b1=new ChildSum(54);
	ChildSum b2=new ChildSum(50);
	ChildSum b3=new ChildSum(4);
	b1.addleft(b2);
	b1.addright(b3);
	System.out.println(b1.child(b1));
	}
}