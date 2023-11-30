public class Teacher extends Person { // abstract нужно дописать после public

    private  String jobTitle;
    public Teacher(int id, String name, String jobTitle) {
        super(id, name);
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return jobTitle + " " + super.getName();
    }

//    public abstract int getSalary();
}
