public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new FullTimeEmployee("E001", "Nimal Perera", 80000, 10, true);
        employees[1] = new Trainee("E002", "Kasun Silva", 30000, 4, true);
        employees[2] = new FieldSalesEmployee("E003", "Amal Fernando", 60000,
                "Western", 500000, 3, 1200);
        employees[3] = new OnlineSalesEmployee("E004", "Dilani Jayawardena", 50000,
                "Online", 1000000, 7, 250);

        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}