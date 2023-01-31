import model.Employee;
import model.Company;
public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        Employee employee1 = new Employee(1, "Pawan Paudel", 100000);
        Employee employee2 = new Employee(2, "Biplab Khadka", 40000);


        company.addEmployee(employee1);
        company.addEmployee(employee2);



        System.out.println(company);
    }
}



