import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class College {
    private List<Student> students;

    public College (int total) {
        this.students = new ArrayList<>();
        IntStream.range(0, total).forEach(index -> {
            this.students.add(new Student());
        });
    }

    public void populateWithHigherThanNumber1 (List<Student> students, int number) {
        if (students != null) {
            students = this.students.stream().filter(student -> student.getAverage() > number).toList();
            System.out.println("Found: " + students.size());
        }
    }

    public void populateWithHigherThanNumber2 (List<Student> students, int number) {
        if (students == null) {
            students = new ArrayList<>();
            System.out.println(students.size());
        }
        students = this.students.stream().filter(student -> student.getAverage() > number).toList();
        System.out.println(students.size());
    }

}
