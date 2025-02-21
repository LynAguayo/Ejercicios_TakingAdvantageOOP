import java.util.ArrayList;

public class Organization {

    private ArrayList<Employee> employees;

    public Organization() {
        this.employees = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee (Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee (Employee employee) {
        employees.remove(employee.getFacebookID()-1);
    }

    public void printEmployess () {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).toString());
        }
    }
    public static void managePayroll () {
        System.out.println("manage payroll");
    }
}
