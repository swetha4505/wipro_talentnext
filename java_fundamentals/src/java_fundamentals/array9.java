package java_fundamentals;
import java.util.*;
public class array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();
        int[] result = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 10) {
                result[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(result));

	}

}
