public class Main {
    public static void main(String[] args) {

        PermanentTeacher oleg = new PermanentTeacher(1, "Олег", "Доцент", 10000);

        TemporaryTeacher vlad = new TemporaryTeacher(2, "Влад", "Профессор",8, 700);

        System.out.println("До обновления " + vlad.getName() + " " + vlad.getId());
        System.out.println("Обновляем ");
        updateVladData(vlad);
        System.out.println("После обновления " + vlad.getName() + " " + vlad.getId());



//        Teacher[] employees = new Teacher[] {oleg, vlad};
//        for (Teacher teacher: employees) {
//            System.out.println(teacher.getName() + " получает " + teacher.getSalary());
//        }

//        Main test = new Main();
//        test.testSalaryCalculation();
//        test.testSalaryCalculationFalse();

    }

    public static void updateVladData(Teacher vlad) {
        vlad.setId(45);
        vlad.setName("Владислав");
        vlad.setPassportNum(123);
    }

    public void testName() {
        TemporaryTeacher vlad = new TemporaryTeacher(2, "Влад", "Профессор",8, 700);
        String i = "3";
        String t = "3";

        if (i == t){
            System.out.println("Строки равны");
        }else {
            System.out.println("Строки не равны");
        }
    }

    public void testSalaryCalculation() {
        TemporaryTeacher vlad = new TemporaryTeacher(2, "Влад", "Профессор", 3, 700);
        if (vlad.getSalary() == 2100) {
            System.out.println("Корректно");
        } else {
            System.out.println("Ошибка");
        }
    }

    public void testSalaryCalculationFalse() {
        int lessonCount = 4;
        int lessonPrice = 700;
        TemporaryTeacher vlad = new TemporaryTeacher(2, "Влад", "Профессор",lessonCount, lessonPrice);
        int result = lessonCount * lessonPrice;
        if (vlad.getSalary() == result) {
            System.out.println("тест ожидаемо упал");
        } else {
            System.out.println("тест прошел, это ошибка");
        }
    }
}