package java_fundamentals;
import java.util.*;
public class array1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}sc.close();
	int sum=0;
	for(int i=0;i<n;i++) {
	sum+=arr[i];
	}
	System.out.println(sum);
	double avg=(double)sum/n;
	System.out.println(avg);
}
}
