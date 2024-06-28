import java.util.HashMap;
import java.util.Map;

public class StudentCourses {
    private Map<String, Integer> courses;

    public StudentCourses() {
        courses = new HashMap<>();
    }

    public void addCourse(String courseName, int marks) {
        courses.put(courseName, marks);
    }

    public void displayCourses() {
        System.out.println("Courses and Marks:");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.addCourse("Mathematics", 90);
        studentCourses.addCourse("Science", 85);
        studentCourses.displayCourses();
    }
}

