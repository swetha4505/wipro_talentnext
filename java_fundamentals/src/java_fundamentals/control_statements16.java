package java_fundamentals;
import java.util.*;

public class control_statements16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("i/p: "+n);
        int r=0;
        while (n!=0) {
            int digit=n%10;
            r=r*10+digit;
            n=n/10;
        }
        System.out.println("o/p: " +r);
    }
}
