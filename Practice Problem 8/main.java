public class main {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee("Nahid", 1040, "IT", 60000);
        Employee e2 = new PartTimeEmployee("Adetty", 1049, "Design", 400, 52);
        Employee e3 = new ContractEmployee("Ratule", 1044, "Development",
                                           "AI project", 120000);

        System.out.println(e1.calculatePay());
        System.out.println(e2.calculatePay());
        System.out.println(e3.calculatePay());
    }
}