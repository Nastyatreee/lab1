package ru.mirea.lab3.Practika6;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-25s %15s%n", "Сотрудник", "Зарплата");
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%-25s %15.2f руб.%n",
                    employees[i].getFullname(),
                    employees[i].getSalary());
        }
    }
}