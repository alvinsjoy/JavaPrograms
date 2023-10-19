import java.util.Scanner;

class Employee
{
    private int id;
    private String name;
    private int age;
    private String gender;
    private String designation;
    private double salary;
    private String address;

    Employee(int id, String name, int age, String gender, String designation, double salary, String address)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    int getId()
    {
        return id;
    }

    void displayDetails()
    {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Gender: " + gender);
        System.out.println("Employee Designation: " + designation);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Address: " + address);
    }
}

class EmployeeDatabase
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Employee Name: ");
            String name = scanner.nextLine();
            System.out.print("Employee Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Employee Gender: ");
            String gender = scanner.nextLine();
            System.out.print("Employee Designation: ");
            String designation = scanner.nextLine();
            System.out.print("Employee Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Employee Address: ");
            String address = scanner.nextLine();

            employees[i] = new Employee(id, name, age, gender, designation, salary, address);
        }
        System.out.print("Enter the ID of the employee you want to search for: ");
        int searchId = scanner.nextInt();
        int flag = 0;
        for (Employee employee : employees)
        {
            if (employee.getId() == searchId)
            {
                employee.displayDetails();
                flag=1;
                break;
            }
        }
        if (flag==0) {
            System.out.println("Employee with ID "+searchId+" not found.");
        }
    }
}
