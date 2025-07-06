package java_fundamentals;
import java.util.*;
public class array13 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        while (true) {
            String line = sc.nextLine().trim();
            String[] parts = line.split("\\s+");

            if (parts.length != 4) {
                System.out.println("You must enter exactly 4 integers.");
                continue;
            }sc.close();
            boolean valid = true;
            for (int i = 0; i < 4; i++) {
                try {
                    arr[i] = Integer.parseInt(parts[i]);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Invalid number '" + parts[i] + "'");
                    valid = false;
                    break;
                }
            }

            if (valid) break;
        }
        System.out.println("The given array is:");
        System.out.println(arr[0] + " " + arr[1]);
        System.out.println(arr[2] + " " + arr[3]);
        System.out.println("The reverse of the array is:");
        System.out.println(arr[3] + " " + arr[2]);
        System.out.println(arr[1] + " " + arr[0]);
}
}
