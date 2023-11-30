public class PermanentTeacher extends Teacher {

    private int salary;

    public PermanentTeacher(int id, String name, String jobTitle, int salary) {
        super(id, name, jobTitle);
        this.salary = salary;
    }

    public  int getSalary() {
        return salary;
    }
}
