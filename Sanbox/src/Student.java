public class Student implements Comparable<Student> {
    private String firstname;
    private String lastname;
    private int id;
    private String course;

    public Student(String firstname, String lastname, int id, String course) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.course = course;
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                ", course='" + course + '\'' +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }   

    public void setCourse(String course) {
        this.course = course;
    }

   
}
