# EmployeeReader

This Java class provides functionality to read employee data from a CSV file located within the project's resources directory. It parses the CSV file and constructs `Employee` objects based on the data.

## Usage

1. 
    ```java
    import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {
            EmployeeReader employeeReader = new EmployeeReader();
            ArrayList<Employee> employees = employeeReader.readEmployeesFromCSV("employee_data.csv", ',');
            // Do something with the list of employees
        }
    }
    ```
