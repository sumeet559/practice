import java.util.*;
public class Queue4{
	public static void main(String[] args){
	PriorityQueue<String> qq=new PriorityQueue<String>();
	qq.add("asdfgh");
	qq.add("asd");
	qq.add("zxcd");
	qq.add("mnhgfds");
	qq.add("d");
	qq.add("ghty");
	for(int i=0;i<6;i++)
	System.out.println(qq.poll()+" ");
	}
	}
