package ru.mirea.lab3.Practika6;

public class Otchet {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        employees[0] = new Employee("Усачева Дарья", 99000.0);
        employees[1] = new Employee("Ослопова Анастасия", 72000.5);
        employees[2] = new Employee("Попов Максим", 480000.0);
        employees[3] = new Employee("Камкия Мари", 91000.75);

        Report.generateReport(employees);
    }
}