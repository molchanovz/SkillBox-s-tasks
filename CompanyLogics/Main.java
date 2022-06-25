package CompanyLogics;

public class Main {
    public static void main(String[] args) {
        Company ozon = new Company();
        for (int i = 0; i < 4; i++) {
            ozon.hire(new Operator("Оператор№"+(i+1),ozon));
        }
        for (int i = 0; i < 4; i++) {
            ozon.hire(new Manager("Менеджер№"+(i+1),ozon));
        }
        ozon.hireAll(new EmployeeAbstract[]{new TopManager("Александр",ozon),new TopManager("Екатерина",ozon)});
        System.out.println(ozon.getTopSalaryStaff(10));
        System.out.println(ozon.getCompanyMoney());
        ozon.fire("Александр");
        System.out.println(ozon.getTopSalaryStaff(9));
    }
}
