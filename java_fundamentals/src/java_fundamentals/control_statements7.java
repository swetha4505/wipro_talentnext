package java_fundamentals;
import java.util.*;
public class control_statements7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		System.out.println("i/p: "+c);
		if(Character.isLowerCase(c)) {
			System.out.println("o/p:" + c + "->" +Character.toUpperCase(c));
		}
		else if(Character.isUpperCase(c)){
			System.out.println("o/p:" + c +"->" + Character.toLowerCase(c));
		}
	}
}
