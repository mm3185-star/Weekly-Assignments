import java.util.Scanner;

public class SalaryIncrement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();

        double increment = salary * 10 / 100;
        double newSalary = salary + increment;

        System.out.println("Increment: " + increment);
        System.out.println("New Salary: " + newSalary);

        input.close();
    }
}
