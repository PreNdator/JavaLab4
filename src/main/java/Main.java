import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmployeeReader reader = new EmployeeReader();

        ArrayList<Employee> employees = reader.readEmployeesFromCSV("foreign_names.csv", ';');
        for (Employee employee : employees) {
            System.out.println("ID:" + employee.id + " name:" + employee.name + " gender:" + employee.gender + " birth_date:" +
                    employee.birthDate + " salary:" + employee.salary + " division_name:" + employee.division.getName() + " division_id:"+ employee.division.getId());
        }
    }
}
