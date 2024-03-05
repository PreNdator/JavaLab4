import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.math.BigDecimal;

public class EmployeeReader {
    public ArrayList<Employee> readEmployeesFromCSV(String csvFilePath, char separator) {
        ArrayList<Employee> employees = new ArrayList<>();
        try (InputStream in = getClass().getClassLoader().getResourceAsStream(csvFilePath)){
            try (CSVReader reader = in == null ? null : new CSVReaderBuilder(new InputStreamReader(in))
                    .withCSVParser(new CSVParserBuilder().withSeparator(separator).build())
                    .build()) {
                String[] nextLine;
                reader.readNext();
                while ((nextLine = reader.readNext()) != null) {
                    int id = Integer.parseInt(nextLine[0]);
                    String name = nextLine[1];
                    String gender = nextLine[2];
                    String birthDate = nextLine[3];
                    Division division = Division.GetDivision(nextLine[4]);
                    BigDecimal salary = new BigDecimal(nextLine[5]);
                    Employee employee = new Employee(id, name, gender, division, salary, birthDate);
                    employees.add(employee);
                }
            }
        } catch (IOException | CsvValidationException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }

}