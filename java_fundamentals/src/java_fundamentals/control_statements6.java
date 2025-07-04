package java_fundamentals;
import java.util.*;
public class control_statements6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String g=sc.nextLine();
		int a=sc.nextInt();
		if(g.equalsIgnoreCase("female") && (a>=1 && a<=58)) {
			System.out.println("The percentage of the interest is 8.2%");
		}
		else if(g.equalsIgnoreCase("female") && (a>=59 && a<=100)) {
			System.out.println("The percentage of the interest is 9.2%");
		}
		else if(g.equalsIgnoreCase("male") && (a>=1 && a<=58)) {
			System.out.println("The percentage of the interest is 8.4%");
		}
		else if(g.equalsIgnoreCase("male") && (a>=59 && a<=100)) {
		System.out.println("The percentage of the interest is 10.5%");
		}
	}

}
