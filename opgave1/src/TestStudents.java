public class TestStudents {
    public static void main(String[] args) {

        Course math = new Course("Math");
        Course danish = new Course("Danish");

        Student jack = new Student("Jack");
        Student julius = new Student("Julius");

        jack.addCourse(math);
        jack.addCourse(danish);

        julius.addCourse(danish);

        System.out.println(jack);
        System.out.println(julius);

        System.out.println(jack.coursesToString());
        System.out.println(julius.coursesToString());
    }
}