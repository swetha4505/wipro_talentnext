package java_fundamentals;
import java.util.*;
public class array12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) a[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) b[i] = sc.nextInt();
        sc.close();
        int[] result = {a[1], b[1]};
        System.out.println(Arrays.toString(result));

	}

}
