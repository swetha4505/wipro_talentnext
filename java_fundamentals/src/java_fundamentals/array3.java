package java_fundamentals;
import java.util.*;
public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }sc.close();
        int target = sc.nextInt();
        int index = -1;
        for (int i = 0;i<a.length; i++) {
            if (a[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println(index);
	}
}
