public class OnlineSalesEmployee extends SalesEmployee {
    private int ordersHandled;

    public OnlineSalesEmployee(String employeeId, String name, double basicSalary,
                               String salesArea, double salesAmount,
                               int yearsWithCompany, int ordersHandled) {
        super(employeeId, name, basicSalary, salesArea, salesAmount, yearsWithCompany);
        this.ordersHandled = ordersHandled;
    }

    @Override
    protected double calculateAllowance() {
        return ordersHandled > 200 ? 8000 : 0;
    }
}