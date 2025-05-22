import java.text.ParseException;

class Person {
    private String name;
    private String dob; // Simplified for this example

    public Person(String name, String dob) throws ParseException {
        this.name = name;
        this.dob = dob;
        // You could parse the dob to Date here if needed
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
    }
}

class Employee extends Person {
    private int empId;
    private double salary;

    public Employee(String name, String dob, int empId, double salary) throws ParseException {
        super(name, dob); // Calls the constructor of Person
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayPersonDetails(); // Method from Person
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) throws ParseException {
        Employee emp = new Employee("John Doe", "1990-01-01", 101, 75000.00);
        emp.displayEmployeeDetails();
    }
}
