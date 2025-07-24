package io_Streams.serialization;
import java.io.*;
import java.util.Date;

public class EmployeeTest {
    public static void main(String[] args) {
 
        Employee emp = new Employee("Swetha", new Date(), "cs", "Developer", 60000.00);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data"))) {
            out.writeObject(emp);
            System.out.println("Employee object has been serialized to 'data' file.");
        } catch (IOException e) {
            System.out.println("Serialization failed: " + e.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("data"))) {
            Employee savedEmp = (Employee) in.readObject();
            System.out.println("\nDeserialized Employee details:");
            System.out.println(savedEmp);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization failed: " + e.getMessage());
        }
    }
}
