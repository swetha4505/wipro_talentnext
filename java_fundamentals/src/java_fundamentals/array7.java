package java_fundamentals;
import java.util.*;
public class array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] a=new int[n];
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }sc.close();
        int[] temp = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (a[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[count] = a[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(temp[i] + " ");
        }

	}

}
