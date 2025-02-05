package PS005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CollectionMap {
    private Map<Integer, Employee> employeeMap;


    public CollectionMap() {
        employeeMap = new HashMap<>();
    }

  
    public Map<Integer, Employee> getEmployeeMap() {
        return employeeMap;
    }


    public void setEmployeeMap(Map<Integer, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }

    public int addEmployee(Employee emp) {
        if (emp == null) {
            return 1; 
        } else if (employeeMap.containsKey(emp.getId())) {
            return 2; 
        } else {
            employeeMap.put(emp.getId(), emp);
            return 0; 
        }
    }

  
    public int removeEmployee(int employeeId) {
        if (employeeMap.containsKey(employeeId)) {
            employeeMap.remove(employeeId);
            return 0; 
        } else {
            return 2; 
        }
    }

    
    public Employee findEmployee(int employeeId) {
        return employeeMap.getOrDefault(employeeId, null); // Return null if not found
    }

 
    public List<Employee> getEmployeeList() {
        if (employeeMap.isEmpty()) {
            return null;
        } else {
            return new ArrayList<>(employeeMap.values());
        }
    }
}


class Employee {
    int id;
    String name;
    double salary;

    public Employee() {}

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}


class TestEmployee {
    public static void main(String[] args) {
        CollectionMap collectionMap = new CollectionMap();

        
        Employee emp1 = new Employee(1, "Alice", 50000);
        Employee emp2 = new Employee(2, "Bob", 60000);
        System.out.println("Add Employee 1: " + collectionMap.addEmployee(emp1));
        System.out.println("Add Employee 2: " + collectionMap.addEmployee(emp2)); 
        System.out.println("Add Duplicate Employee 1: " + collectionMap.addEmployee(emp1)); 

      
        System.out.println("Find Employee 1: " + collectionMap.findEmployee(1)); 
        System.out.println("Find Employee 4: " + collectionMap.findEmployee(4)); 

        System.out.println("Remove Employee 2: " + collectionMap.removeEmployee(2)); 
        System.out.println("Remove Employee 4: " + collectionMap.removeEmployee(4)); 

       
        List<Employee> employeeList = collectionMap.getEmployeeList();
        if (employeeList != null) {
            for (Employee emp : employeeList) {
                System.out.println(emp);
            }
        } else {
            System.out.println("No employees found.");
        }
    }
}
