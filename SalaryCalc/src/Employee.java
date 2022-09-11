public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax () {
        double tax;
        if (this.salary <= 1000) {
            tax = 0;
        }else {
            tax = (this.salary / 100) * 3;
        }
        return tax;
    }

    public int bonus () {
        int bonus;
        if (this.workHours <= 40) {
            bonus = 0;
        }else {
            bonus = (this.workHours - 40) * 30;
        }
        return bonus;
    }

    public double riseSalary() {
        double riseSalary;
        int thisYear = 2021;
        int workedYear = thisYear - this.hireYear;
        if (workedYear < 10) {
            riseSalary = (this.salary / 100) * 5;
        }else if (workedYear >= 10 && workedYear < 20) {
            riseSalary = (this.salary / 100) * 10;
        }else {
            riseSalary = (this.salary / 100) * 15;
        }
        return riseSalary;
    }

    public void print() {
        System.out.println("Ad-soyad: " + this.name);
        System.out.println("Maaş: " + this.salary);
        System.out.println("Çalışma saati: " + this.workHours);
        System.out.println("Başlangıç yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş artışı: " + riseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş: " + (this.salary - tax() + bonus()));
        System.out.println("Yeni maaş: " + (this.salary + riseSalary()));
    }
}
