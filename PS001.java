package PS001;
class Employee {
    protected String name;
    protected int age;
    protected double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public double calculatePay() {
        return salary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int age, double hourlyRate, int hoursWorked) {
        super(name, age, hourlyRate * hoursWorked);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() + bonus;
    }
}

public class PS001 {
    public static void main(String[] args) {
        Employee ptEmployee = new PartTimeEmployee("John", 25, 20.0, 80);
        Employee ftEmployee = new FullTimeEmployee("Jane", 30, 50000.0, 5000.0);

        System.out.println("Part-time Employee Pay: " + ptEmployee.calculatePay());
        System.out.println("Full-time Employee Pay: " + ftEmployee.calculatePay());
    }
}