package CompanyLogics;

public class Manager extends EmployeeAbstract{

    private double moneyForCompany;

    public Manager(String name,Company company) {
        setName(name);
        setJobTitle("Менеджер");
        setSalary(company,50000);
    }

    @Override
    public void setSalary(Company company,double salary) {
        moneyForCompany =  (int)( Math.random() * (140000 - 115000) ) + 115000;
        company.setCompanyMoney(moneyForCompany);
        super.setSalary(company,salary+(int)(moneyForCompany*0.05));
    }
}
