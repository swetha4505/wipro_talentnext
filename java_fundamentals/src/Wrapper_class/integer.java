package Wrapper_class;

public class integer {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an integer as a command-line argument.");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);

            System.out.println("Given Number : " + number);
            System.out.println("Binary equivalent : " + Integer.toBinaryString(number));
            System.out.println("Octal equivalent : " + Integer.toOctalString(number));
            System.out.println("Hexadecimal equivalent : " + Integer.toHexString(number).toUpperCase());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter a valid integer.");
        }
    }
}
