package java_fundamentals;
import java.util.*;
public class control_statements12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(prime(n)) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}
	static boolean prime(int n) {
		if(n <2) return false;
		for(int i=2;i*i<=n;i++) {
			if(n % i==0) return false;
		}return true;

	}

}
