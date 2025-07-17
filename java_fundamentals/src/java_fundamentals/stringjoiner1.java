package java_fundamentals;
import java.util.*;
public class stringjoiner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = sc.nextLine();
            names.add(name);
        }

        // Use StringJoiner to build the result
        StringJoiner joiner = new StringJoiner(", ", "{", "}");
        names.forEach(joiner::add);

        System.out.println("Joined Names: " + joiner.toString());

        sc.close();

	}

}
