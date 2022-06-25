package CompanyLogics;

import java.lang.reflect.Array;
import java.util.*;

public class Company implements Comparator {

    List<EmployeeAbstract> list = new ArrayList<>();

    private static double companyMoney = 0;

    public double getCompanyMoney() {
        return companyMoney;
    }

    public void setCompanyMoney(double money) {
        companyMoney += money;
    }

    void hire(EmployeeAbstract employee) {
        list.add(employee);
    }

    void hireAll(EmployeeAbstract[] list) {
        for (EmployeeAbstract employee : list) {
            this.list.add(employee);
        }
    }

    public ArrayList<String> getAll() {
        ArrayList<String> sortedList = new ArrayList<String>();
        for (EmployeeAbstract emp : list) {
            sortedList.add(emp.showAll());
        }
        return sortedList;
    }

    public List<EmployeeAbstract> getSortedList() {
        list.sort(SalaryComparator);
        return list;
    }

    public ArrayList<String> getLowestSalaryStaff(int index) {
        try {
            ArrayList<String> sortedList = new ArrayList<>();
            getSortedList();
            for (int i = 0; i < index; i++) {
                sortedList.add(list.get(i).showAll());
            }
            return sortedList;
        } catch (Exception e) {
            System.out.print("Неверное значение, ");
            return new ArrayList<>();
        }
    }

    public ArrayList<String> getTopSalaryStaff(int index) {
        try {
            ArrayList<String> sortedList = new ArrayList<String>();
            getSortedList();
            list.sort(SalaryComparator.reversed());
            for (int i = 0; i < index; i++) {
                sortedList.add(list.get(i).showAll());
            }
            return sortedList;
        } catch (Exception e) {
            System.out.print("Неверное значение, ");
            return new ArrayList<>();
        }
    }

    public void fire(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                list.remove(i);
                System.out.println("Был удален сотрдник - " + name);
            }
        }
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    public static Comparator<EmployeeAbstract> SalaryComparator = new Comparator<EmployeeAbstract>() {

        @Override
        public int compare(EmployeeAbstract o1, EmployeeAbstract o2) {
            return (int) (o1.getSalary() - o2.getSalary());
        }

        @Override
        public Comparator<EmployeeAbstract> reversed() {
            return Comparator.super.reversed();
        }
    };
}

