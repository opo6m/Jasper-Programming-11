import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> teachers = new ArrayList<>();

    private ArrayList<Student> students = new ArrayList<>();

    private String name;
    private String principal;
    private int age;


    // create a new school object
    public School(String name, int age, String principal) {
        this.name = name;
        this.age = age;
        this.principal = principal;
    }

    /* Methods */

    // add student to students array
    public void addStudent(Student student) {
        this.students.add(student);
    }

    // add teacher to teachers array
    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    // delete student from students array
    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    // delete teacher from teachers array
    public void removeTeacher(Teacher teacher) {
        this.teachers.remove(teacher);
    }

    // retrieve the teachers array with Teacher objects
    public ArrayList<Teacher> showTeachers() {
        return teachers;
    }
    // retrieve the students array with Student objects
    public ArrayList<Student> showStudents() {
        return students;
    }

    /* Setters and getters */

    // get the name of the school
    public String getName() {
        return name;
    }
    // set the name of the school
    public void setName(String name) {
        this.name = name;
    }
    // get the name of the principal of the school
    public String getPrincipal() {
        return principal;
    }
    // set the name of the principal of the school
    public void setPrincipal(String principal) {
        this.principal = principal;
    }
    // get the age of the school
    public int getAge() {
        return age;
    }
    // set the age of the school
    public void setAge(int age) {
        this.age = age;
    }


}
