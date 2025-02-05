package PS004;

public class Client {
    
    private double basePay;
    private int hoursWorked;

   
    public Client() {
        this.basePay = 0.0;
        this.hoursWorked = 0;
    }

   
    public Client(double basePay, int hoursWorked) {
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }

    
    public void computeSalary() {
      
        final double MINIMUM_WAGE = 8.00;
        final int MAX_HOURS = 60;
        final int REGULAR_HOURS = 40;
        final double OVERTIME_MULTIPLIER = 1.5;

        
        if (basePay < MINIMUM_WAGE) {
            System.out.println("Error: Base pay cannot be less than $" + MINIMUM_WAGE + " per hour.");
            return;
        }

        
        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked cannot exceed " + MAX_HOURS + " hours per week.");
            return;
        }

        
        double totalPay;
        if (hoursWorked <= REGULAR_HOURS) {
            totalPay = hoursWorked * basePay;
        } else {
            int overtimeHours = hoursWorked - REGULAR_HOURS;
            totalPay = (REGULAR_HOURS * basePay) + (overtimeHours * basePay * OVERTIME_MULTIPLIER);
        }

        
        System.out.printf("Total pay for the employee: $%.2f%n", totalPay);
    }

    public static void main(String[] args) {
        
        Client employee1 = new Client(7.50, 35); 
        System.out.println("Employee 1:");
        employee1.computeSalary();

        Client employee2 = new Client(8.20, 47); 
        System.out.println("Employee 2:");
        employee2.computeSalary();

        Client employee3 = new Client(10.00, 3); 
        System.out.println("Employee 3:");
        employee3.computeSalary();
    }
}

