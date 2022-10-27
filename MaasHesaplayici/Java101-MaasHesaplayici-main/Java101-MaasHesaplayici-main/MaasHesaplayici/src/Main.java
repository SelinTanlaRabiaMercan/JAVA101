public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Sümeyye", 1200, 45, 1998);
        Employee employee1 = new Employee("Ahmet", 1000, 40, 2020);
        Employee employee2 = new Employee("Tanla", 10546, 35, 2022);

        employee.bonus();
        employee.raiseSalary();
        employee.tax();
        employee.yaz();
        System.out.println("-----");
        employee1.bonus();
        employee1.raiseSalary();
        employee1.tax();
        employee1.yaz();
        System.out.println("-----");
        employee2.bonus();
        employee2.raiseSalary();
        employee2.tax();
        employee2.yaz();

    }
}