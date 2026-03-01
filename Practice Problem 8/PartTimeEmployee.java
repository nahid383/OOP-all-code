class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    PartTimeEmployee(String name, int id, String department,
                     double hourlyRate, int hoursWorked) {
        super(name, id, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}