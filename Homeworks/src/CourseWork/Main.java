package CourseWork;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] arg) {
        CourseWork.printEmployees();
        CourseWork.printFullName();
        System.out.println("Average salary = " + CourseWork.calculateAverageSalary());
        System.out.println("Total salary = " + CourseWork.calculateTotalSalary());
        System.out.println(CourseWork.findEmployeeWithMaxSalary());
        System.out.println(CourseWork.findEmployeeWithMinSalary());

        Employee employee = CourseWork.findMinSalaryEmployeeOfDepartment(1);

    }
}
