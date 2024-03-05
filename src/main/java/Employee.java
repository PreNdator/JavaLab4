import java.math.BigDecimal;

public class Employee {
    public int id;
    public String name;
    public String gender;
    public Division division;
    public BigDecimal salary;

    public String birthDate;
    public Employee(int id, String name, String gender, Division division, BigDecimal salary, String birthDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.division = division;
        this.salary = salary;
        this.birthDate = birthDate;
    }
}
