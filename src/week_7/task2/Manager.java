package week_7.task2;

public class Manager extends Employee {

    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void printDepartment() {
        System.out.println("Department of Employee: " + department);
    }

}
