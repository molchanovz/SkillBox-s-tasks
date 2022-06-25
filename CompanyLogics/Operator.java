package CompanyLogics;

public class Operator extends EmployeeAbstract{
    public Operator(String name,Company company){
        setName(name);
        setJobTitle("Оператор");
        setSalary(company,30000);
    }
}
