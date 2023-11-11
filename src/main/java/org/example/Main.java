package Company.employees;

import Company.Company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmployeeByHour employee = new EmployeeByHour("Олег", "Сергеевич", "Иванов", 20, 200);
        StaffMember staffMember = new StaffMember("Иван", "Олегович", "Сергеев", 40000);
        PieceEmployee pieceEmployee = new PieceEmployee("Сергей", "Иванович", "Олегов", 6);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(staffMember);
        Company company = new Company(employees);

        pieceEmployee.showPayments();
        //System.out.println(company.calcSalary());

    }
}