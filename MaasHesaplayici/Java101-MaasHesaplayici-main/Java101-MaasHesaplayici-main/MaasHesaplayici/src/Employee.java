public class Employee {
    String name;
    double salary;    //Çalışanın maaşı
    int workHouse; //Haftalık çalışma saati
    int hireYear;  //İşe başlangıç yılı

    public Employee(String name, int salary, int workHouse, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHouse = workHouse;
        this.hireYear = hireYear;
    }

    public double tax() {
        double vergi = 0;
        if (salary < 1000) {
            vergi = 0;
        }
        if (salary >= 1000) {
            vergi = (salary * (0.03));
            salary -= vergi;
        }
        return salary;
    }

    public double bonus() {
        int saat = 0;
        if (workHouse > 40) {
            saat = workHouse - 40;
            salary = salary + (saat * 30);
        }
        return salary;
    }

    public double raiseSalary() {
        int yil = 2022;
        if (yil - hireYear < 10) {
            salary = salary + (salary * 0.05);
        }
        if (yil - hireYear < 20 && yil - hireYear > 9) {
            salary = salary + (salary * 0.1);
        }
        if (yil - hireYear > 19) {
            salary = salary + (salary * 0.15);
        }
        return salary;
    }

    public void yaz() {
        System.out.println("Çalışanın \nAdı : " + name +
                "\nMaaşı : " + salary +
                "\nHaftalık çalışma saati : " + workHouse +
                "\nİşe başlama tarihi : " + hireYear);
    }
}