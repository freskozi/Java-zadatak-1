import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class StudentDatabase {
    private Map<Integer, Student> students;
    private int nextStudentId = 6; // Start with 6 for the next student ID

    public StudentDatabase() {
        students = new HashMap<>();
        // Initialize with 5 students
        students.put(1, new Student(1, "Cristiano Ronaldo"));
        students.put(2, new Student(2, "Lionel Messi"));
        students.put(3, new Student(3, "Kylian Mbappe"));
        students.put(4, new Student(4, "Erling Haaland"));
        students.put(5, new Student(5, "Roger Federer"));
    }

    public void createStudent(String name) {
        int newStudentId = nextStudentId++;
        students.put(newStudentId, new Student(newStudentId, name));
        System.out.println("Student created successfully with ID " + newStudentId + ".");
    }

    public void readStudents() {
        System.out.println("List of Students:");
        for (Student student : students.values()) {
            System.out.println(student.getId() + ". " + student.getName());
        }
    }

    public void updateStudent(int id, String name) {
        if (students.containsKey(id)) {
            Student student = students.get(id);
            student.setName(name);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(int id) {
        if (students.containsKey(id)) {
            students.remove(id);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
