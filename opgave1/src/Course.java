public class Course {
    private String name;

    Course( String _name ) {
        name = _name;
    }

    public String toString() {
        return "Course: " + name;
    }

    public String getName() {
        return name;
    }
}
