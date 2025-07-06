package java_fundamentals;
import java.util.*;
public class array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] a=new int[n];
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }sc.close();
        Arrays.sort(a);
        System.out.println("Smallest 2 numbers: " + a[0] + ", " + a[1]);
        System.out.println("Largest 2 numbers: " + a[n-1] + ", " + a[n-2]);
	}

}
