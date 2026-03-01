class FullTimeEmployee extends Employee {
    private double fixedSalary;

    FullTimeEmployee(String name, int id, String department, double fixedSalary) {
        super(name, id, department);
        this.fixedSalary = fixedSalary;
    }

    @Override
    double calculatePay() {
        return fixedSalary;
    }
}