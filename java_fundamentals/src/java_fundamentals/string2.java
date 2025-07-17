package java_fundamentals;
import java.util.*;
public class string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		a=a.toLowerCase();
		b=b.toLowerCase();
		if (a.length() > 0 && b.length() > 0 &&
	            a.charAt(a.length() - 1) == b.charAt(0)) {
	            b = b.substring(1);
		}sc.close();
		 String result = a + b;
	     System.out.println(result);
	}

}
