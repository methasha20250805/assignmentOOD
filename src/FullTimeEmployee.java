public class FullTimeEmployee extends Employee {
    private int overtimeHours;
    private boolean nightShift;

    public FullTimeEmployee(String employeeId, String name, double basicSalary,
                            int overtimeHours, boolean nightShift) {
        super(employeeId, name, basicSalary);
        this.overtimeHours = overtimeHours;
        this.nightShift = nightShift;
    }

    @Override
    public double calculateSalary() {
        double salary = getBasicSalary() + 1000 * overtimeHours;
        if (nightShift) {
            salary += 0.10 * getBasicSalary();
        }
        return salary;
    }
}
