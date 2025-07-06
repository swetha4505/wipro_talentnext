package java_fundamentals;
import java.util.*;
public class control_statements5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(c>='A' && c<='Z'||c>='a' && c<='z') {
			System.out.println("Alphabet");
		}
		else if(c>='0' && c<='9') {
			System.out.println("Digit");
		}
		else {
		System.out.println("Special Character");
		}sc.close();
	}
}
