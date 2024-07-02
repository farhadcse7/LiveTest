package problem01;

public class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    public Employee(int employee_id, String employee_name, double employee_salary) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }

    // Getter for employee_id
    public int getEmployeeId() {
        return employee_id;
    }

    // Setter for employee_id
    public void setEmployeeId(int employee_id) {
        this.employee_id = employee_id;
    }

    // Getter for employee_name
    public String getEmployeeName() {
        return employee_name;
    }

    // Setter for employee_name
    public void setEmployeeName(String employee_name) {
        this.employee_name = employee_name;
    }

    // Getter for employee_salary
    public String getEmployeeSalary() {
        return String.format("$%.2f", employee_salary);
    }

    // Main method for testing
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Alex Hurt", 60000);
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Employee Salary: " + emp.getEmployeeSalary());

        // Update employee details
        emp.setEmployeeId(2);
        emp.setEmployeeName("Farhad Mia");

        System.out.println("Updated Employee ID: " + emp.getEmployeeId());
        System.out.println("Updated Employee Name: " + emp.getEmployeeName());
        System.out.println("Updated Employee Salary: " + emp.getEmployeeSalary());
    }
}
