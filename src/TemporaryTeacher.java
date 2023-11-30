public class TemporaryTeacher extends Teacher {

    private int lessonCount;
    private int lessonPrice;

    public TemporaryTeacher(int id, String name, String jobTitle, int lessonCount, int lessonPrice) {
        super(id, name, jobTitle);
        this.lessonCount = lessonCount;
        this.lessonPrice = lessonPrice;
    }

    public int getSalary() {
        return lessonCount * lessonPrice;
    }
}
