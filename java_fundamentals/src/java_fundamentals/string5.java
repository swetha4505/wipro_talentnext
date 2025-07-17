package java_fundamentals;
import java.util.*;
public class string5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.length()>2) {
			String a=s.substring(1,s.length()-1);
			System.out.println(a);
		}
		else {
			System.out.println("Null"); 
		}sc.close();

	}

}
