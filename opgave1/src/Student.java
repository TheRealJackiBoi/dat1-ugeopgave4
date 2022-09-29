import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    Student( String _name ) {
        name = _name;
    }

    public void addCourse(Course crs) {
        courses.add(crs);
    }

    public String toString() {
        return "Student: " + name;
    }

    public String coursesToString() {
        String str = name + " has: ";

        boolean first = true;
        for (Course c : courses) {
            if (first) {
                str += c.getName();
                first = false;
            }
            else {
                str += ", " + c.getName();
            }
        }
        return str;
    }
}