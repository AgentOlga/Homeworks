package CourseWork;

public class CourseWork {
    private static final Employee[] employees = new Employee[]{
            new Employee("Mosing Møgens", 26000, 1),
            new Employee("Blaksteina Agne", 28002, 1),
            new Employee("Toker Boris", 45900, 5),
            new Employee("Ralhan Elena", 32803, 2),
            new Employee("Christensen Frede", 29608, 1),
            new Employee("Gurung Jack", 37006, 5),
            new Employee("Munck Jakob", 38625, 4),
            new Employee("Bruun Janni", 35404, 2),
            new Employee(" Henriksen Kim", 39751, 4),
            new Employee("Kerepesi Agata", 18103, 1)
    };


    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }

        }
        return result;
    }


    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary)  {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalary() {
        var total = calculateTotalSalary();
        return  total / (float) employees.length;
    }

    public static void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void increaseSalary(int percent) {
        for (Employee employee : employees) {
            int currentSalary = employee.getSalary();
            employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
        }
    }

    public static Employee findMinSalaryEmployeeOfDepartment(int departmentId) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartmentId() != departmentId) {
                continue;
            }
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findMaxSalaryEmployeeOfDepartment(int departmentId) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartmentId() != departmentId) {
                continue;

            }
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static int calculateTotalSalaryDepartment(int departmentId) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartmentId() == departmentId) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static float calculateAverageSalaryDepartment(int departmentId) {
        int participantsCount = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartmentId() == departmentId) {
                sum += employee.getSalary();
                participantsCount++;
            }
        }
        return sum / (float) participantsCount;
    }

    public static void increaseSalaryOfDepartment(int departmentId, int percent) {
        for (Employee employee : employees) {
            if (employee.getDepartmentId() == departmentId) {
                int currentSalary = employee.getSalary();
                employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
            }
        }
    }

    public static void printDepartment(int departmentId) {
        for (Employee employee : employees) {
            if (employee.getDepartmentId() == departmentId) {
                System.out.println(employee);
            }
        }
    }

    public static void printEmployeesWithSalaryLessThan(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println(employee);
            }
        }
    }

    public static void printEmployeesWithSalaryMoreThan(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println(employee);
            }
        }
    }
}