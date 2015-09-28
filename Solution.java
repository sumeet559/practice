import java.util.Scanner;
public class Solution {
    public int addDigits(int num1) {
			int sum=0;
			 while(num1!=0){  
                sum=sum + num1%10;
                num1=num1/10;	
            }
			if(sum>=10){return addDigits(sum);}
				else return sum;
    }
    public static void main(String[] args){
        Solution s=new Solution();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int x=s.addDigits(num);
        System.out.println(x);
    }
}
