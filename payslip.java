import java.util.Scanner;

public class BasicPayslipCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter employee email: ");
        String email = scanner.nextLine();

        System.out.print("Enter employee address: ");
        String address = scanner.nextLine();

        System.out.print("Enter employee phone: ");
        String phone = scanner.nextLine();

        System.out.print("Enter employee designation: ");
        String designation = scanner.nextLine();

        System.out.print("Enter company name: ");
        String companyName = scanner.nextLine();

        System.out.print("Enter date of joining (YYYY-MM-DD): ");
        String doj = scanner.nextLine();

        System.out.print("Enter CTC (Cost to Company): ");
        double CTC = scanner.nextDouble();

        // Calculate payslip components
        double basicSalary = 0.4 * CTC;
        double HRA = 0.5 * basicSalary;
        double PF = 0.12 * basicSalary;

        // Print employee payslip
        System.out.println("\nEmployee Payslip:");
        System.out.println("-----------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Designation: " + designation);
        System.out.println("Company Name: " + companyName);
        System.out.println("Date of Joining: " + doj);
        System.out.println("CTC: " + CTC);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + HRA);
        System.out.println("PF: " + PF);

        // Close scanner
        scanner.close();
    }
}
