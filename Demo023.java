 class Demo023 {
    private double basePay;
    private int hoursWorked;


    public Demo023() {
    }

    public Demo023(double basePay, int hoursWorked) {
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }

  
    public void computeSalary() {
        
        if (basePay < 8.00) {
            System.out.println("Error: Base pay must be at least $8.00 per hour.");
            return;
        }
       
        if (hoursWorked > 60) {
            System.out.println("Error: Hours worked must not exceed 60 hours.");
            return;
        }

        double totalPay = 0.0;
        if (hoursWorked <= 40) {
            totalPay = hoursWorked * basePay;
        } else {
            int overtimeHours = hoursWorked - 40;
            totalPay = (40 * basePay) + (overtimeHours * basePay * 1.5);
        }
        System.out.printf("Total pay: $%.2f%n", totalPay);
    }

    public static void main(String[] args) {
     
        Demo023 employee1 = new Demo023(7.50, 35);
        employee1.computeSalary();

  Demo023 employee2 = new Demo023(8.20, 47);
        employee2.computeSalary();

        Demo023 employee3 = new Demo023(10.00, 3);
        employee3.computeSalary();
    }
}