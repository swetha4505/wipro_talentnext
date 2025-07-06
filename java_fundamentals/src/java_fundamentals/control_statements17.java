package java_fundamentals;
import java.util.*;
public class control_statements17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n >0) {
			int rem = n%10;
		    sum=sum*10+rem;
			n=n/10;
		}sc.close();
		if(sum==temp) {
			System.out.println(temp +" is a palindrome");
		}else {
			System.out.println(temp+" is not a palindrome");
		}

	}

}
