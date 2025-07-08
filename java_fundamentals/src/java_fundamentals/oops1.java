package java_fundamentals;

import java.util.Scanner;

class Box {
	public int width;
	public int height;
	public int depth;

	public Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public double calculateVolume() {
		return width * height * depth;
	}
}

public class oops1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("width: ");
		int width = sc.nextInt();
		System.out.print("height: ");
		int height = sc.nextInt();
		System.out.print("depth: ");
		int depth = sc.nextInt();
		Box myBox = new Box(width, height, depth);
		System.out.println("Volume of the box is: " + myBox.calculateVolume());
		sc.close();
	}
}
