package week_7.task2;

public class Employee extends Member {

    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void printSpecialization() {
        System.out.println("Specialization of Employee: " + specialization);
    }

}
