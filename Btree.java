public class Btree{
	public int data;
	public Btree left;
	public Btree right;
	public Btree(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
	public Btree getleft(){
		return left;
	}
	public void setleft(Btree left){
		this.left=left;
	}
	public void setright(Btree right){
		this.right=right;
	}
	public void inorder(Btree root){
		if(root!=null){
		
		
		System.out.println(root.data);
		inorder(root.left);
		inorder(root.right);
		}
	}
	public int size(Btree root){
		int leftcount=0;
		int rightcount=0;
		if(root.left!=null){leftcount=size(root.left);}
		if(root.right!=null)rightcount=size(root.right);
		return 1+leftcount+rightcount;
	}
	public int height(Btree root){
		if(root==null)return 0;
		int leftheight=height(root.left);
		int rightheight= height(root.right);
		if(leftheight>rightheight)return 1+leftheight;
		else return 1+rightheight;
	}
	public void delete(Btree root)
	{	
		if(root!=null){
			delete(root.left);
			delete(root.right);
			System.out.println("deleting node"+ root.data);
			root=null;
		}
	}
	public void mirror(Btree root){
		if(root!=null){}
	}
	
	public static void main(String[] args){
		Btree b=new Btree(5);
		Btree b2=new Btree(10);
		Btree b3=new Btree(32);
		Btree b4=new Btree(45);
		Btree b5=new Btree(90);
		b.setleft(b2);
		b2.setright(b3);
		b3.setleft(b4);
		b3.setright(b5);
		int height1=b.height(b);
		int s= b.size(b);
		System.out.println(s+","+height1);
		b.delete(b);
		System.out.println(b.left.data);
		
	}
}