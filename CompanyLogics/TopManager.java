package CompanyLogics;

public class TopManager extends EmployeeAbstract{

    public TopManager(String name, Company company) {
        setName(name);
        setJobTitle("ТопМенеджер");
        setSalary(company,100000);
    }

    @Override
    public void setSalary(Company company,double salary) {
        if(company.getCompanyMoney()>10000000){
            super.setSalary(company,salary+(salary*1.5));
        }
        else super.setSalary(company,salary);
    }
}
