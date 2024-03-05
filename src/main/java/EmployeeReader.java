import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EmployeeReader {
    public ArrayList<Employee> readEmployeesFromCSV(String csvFilePath, char separator) {
        ArrayList<Employee> employees = new ArrayList<>();
        try (InputStream in = getClass().getClassLoader().getResourceAsStream(csvFilePath)){
            try (CSVReader reader = in == null ? null : new CSVReaderBuilder(new InputStreamReader(in))
                    .withCSVParser(new CSVParserBuilder().withSeparator(separator).build())
                    .build()) {
                String[] nextLine;
                while ((nextLine = reader.readNext()) != null) {

                }
            }
        } catch (IOException | CsvValidationException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }


}