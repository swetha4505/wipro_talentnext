package java_fundamentals;
import java.util.*;
public class control_statements8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char color=sc.next().charAt(0);
		switch(color) {
		case 'R':System.out.println("Red");
		break;
		case 'B':System.out.println("Blue");
		break;
		case 'G':System.out.println("Green");
		break;
		case 'O':System.out.println("Orange");
		break;
		case 'Y':System.out.println("Yellow");
		break;
		default: System.out.println("Invalid code");
		}
		sc.close();
	}
}

