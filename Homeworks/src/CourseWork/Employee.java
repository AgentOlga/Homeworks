package CourseWork;

public class Employee {
    private final Integer id;
    private String fullName;
    private Integer salary;
    private Integer departmentId;

    private static Integer idCounter = 1;

    /**
     * @param fullName     - ФИО
     * @param salary       - зарплата
     * @param departmentId - отдел
     */

    public Employee(String fullName, Integer salary, Integer departmentId) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", departmentId=" + departmentId +
                '}';
    }

}

