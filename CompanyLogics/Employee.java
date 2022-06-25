package CompanyLogics;

public interface Employee {
    String getName();

    void setName(String name);

    void setSalary(Company company, double salary);

    double getSalary();

    String getJobTitle();

    void setJobTitle(String title);

}
