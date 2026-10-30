public abstract class Employee {
    private String employeeId;
    private String name;
    private double basicSalary;

    public Employee(String employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBasicSalary() { return basicSalary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.printf("ID: %s | Name: %s | Salary: %,.2f%n",
                employeeId, name, calculateSalary());
    }
}