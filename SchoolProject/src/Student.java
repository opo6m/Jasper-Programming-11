
public class Student {

    private String firstName;
    private String lastName;
    private int grade;


    static int studentCounter = 0;
    private int studentId; // no setter for the student number

    // create a new Student object
    public Student(String firstName, String lastName, int grade) {
        studentCounter++;

        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentId = this.studentCounter;

    }

    // override the default toString method which prints out the hashcode and instead print out readable data of the student
    @Override
    public String toString() {
        return "Name: " + this.getFullName() + " Grade: " + this.getGrade() + " Student Number: " + this.getStudentId() ;
    }

    /* setters and getters */

    // retrieve the student number of the student
    public int getStudentId() {
        return studentId;
    }

    // retrieve the full name of the student
    public String getFullName() {

        return this.firstName + " " + this.lastName;
    }
    // set the first name of the student
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    // set the last name of the student
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // retrieve the grade of the student
    public int getGrade() {
        return this.grade;
    }
    // set the grade of the student
    public void setGrade(int grade) {
        this.grade = grade;
    }




}
