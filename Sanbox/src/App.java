import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("John", "Doe", 1, "CS");
        Student s2 = new Student("Jane", "Doe", 2, "CS");
        Student s3 = new Student("Cath", "Tom", 3, "CS");

        ArrayList<Student> students = new ArrayList<>();
        
        students.add(s1);
        students.add(s2);
        students.add(s3);

        students.sort(null);

        for (Student s : students) {
            System.out.println(s);
        }

    }


}
