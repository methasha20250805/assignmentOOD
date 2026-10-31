public abstract class SalesEmployee extends Employee implements LoyaltyBonus {
    private String salesArea;
    private double salesAmount;
    private int yearsWithCompany;

    public SalesEmployee(String employeeId, String name, double basicSalary,
                         String salesArea, double salesAmount, int yearsWithCompany) {
        super(employeeId, name, basicSalary);
        this.salesArea = salesArea;
        this.salesAmount = salesAmount;
        this.yearsWithCompany = yearsWithCompany;
    }

    public String getSalesArea() { return salesArea; }
    public double getSalesAmount() { return salesAmount; }
    public int getYearsWithCompany() { return yearsWithCompany; }

    // Subclass-specific allowance (travel / online orders)
    protected abstract double calculateAllowance();

    @Override
    public double getBonusRate() {
        return Math.min(0.02 * yearsWithCompany, 0.10);
    }

    @Override
    public double calculateSalary() {
        double commission = 0.04 * salesAmount;
        double subtotal = getBasicSalary() + commission + calculateAllowance();
        return subtotal + subtotal * getBonusRate();   // loyalty bonus added on top
    }
}
