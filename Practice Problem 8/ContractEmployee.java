class ContractEmployee extends Employee {
    private String projectName;
    private double contractAmount;

    ContractEmployee(String name, int id, String department,
                     String projectName, double contractAmount) {
        super(name, id, department);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }

    @Override
    double calculatePay() {
        return contractAmount;
    }
}