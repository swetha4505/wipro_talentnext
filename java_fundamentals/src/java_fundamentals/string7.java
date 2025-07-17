package java_fundamentals;
import java.util.*;
public class string7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.length() > 0 && (s.charAt(0)=='x'||s.charAt(0)=='X')){
			s=s.substring(1);
		}
		if(s.length()>0 && (s.charAt(s.length()-1)=='x'||s.charAt(s.length()-1)=='X')) {
			s=s.substring(0,s.length()-1);
		}
		System.out.println(s);

		sc.close();
	}

}
