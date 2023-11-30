public class Person {
    private int id;
    private String name;
    private int passportNum;

    public Person(int id, String name, int passportNum) {
        this.id = id;
        this.name = name;
        this.passportNum = passportNum;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(Person person) {
        this(person.id, person.name, person.passportNum);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(int passportNum) {
        this.passportNum = passportNum;
    }
}
