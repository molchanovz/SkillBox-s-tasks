package CompanyLogics;

public class EmployeeAbstract implements Employee {
    private String name;
    private double salary;
    private String jobTitle;


    public String showAll() {
        return (name + " - " + jobTitle + " - " + salary);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSalary(Company company, double salary) {

        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public void setJobTitle(String title) {
        this.jobTitle = title;
    }
}
