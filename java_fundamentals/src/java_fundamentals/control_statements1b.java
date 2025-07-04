package java_fundamentals;
import java.util.*;
public class control_statements1b {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		if (n%10 == m%10) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}
