import java.util.*;
public class Queue5{
public static void main(String[] args){
ArrayDeque<Integer> ad=new ArrayDeque<Integer>(5);
ad.addFirst(100);
ad.addFirst(54);
ad.addLast(21);
ad.addLast(1);
while(!ad.isEmpty()){System.out.println(ad.poll()+" "+ad.pollLast());}
}
}