public class FieldSalesEmployee extends SalesEmployee {
    private double kmTravelled;

    public FieldSalesEmployee(String employeeId, String name, double basicSalary,
                              String salesArea, double salesAmount,
                              int yearsWithCompany, double kmTravelled) {
        super(employeeId, name, basicSalary, salesArea, salesAmount, yearsWithCompany);
        this.kmTravelled = kmTravelled;
    }

    @Override
    protected double calculateAllowance() {
        return kmTravelled > 1000 ? 15000 : 0;
    }
}