package app;

import data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("ilhamZale");
        Company.Employee employee = company.new Employee();
        employee.setName("Ilham");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
