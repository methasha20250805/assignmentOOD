public class Trainee extends Employee {
    private int monthsCompleted;
    private boolean passedAssessment;

    public Trainee(String employeeId, String name, double basicSalary,
                   int monthsCompleted, boolean passedAssessment) {
        super(employeeId, name, basicSalary);
        this.monthsCompleted = monthsCompleted;
        this.passedAssessment = passedAssessment;
    }

    @Override
    public double calculateSalary() {
        double salary = getBasicSalary() + 500 * monthsCompleted;
        if (passedAssessment) {
            salary += 5000;
        }
        return salary;
    }
}