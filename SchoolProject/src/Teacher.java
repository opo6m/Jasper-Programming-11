public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;

    // create a new Teacher object
    public Teacher(String firstName,String lastName,String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    // override the default toString method which prints out the hashcode and instead print out readable data of the teacher
    @Override
    public String toString() {
        return "Name: " + this.getFullName() + " Subject: " + this.getSubject() ;
    }

    /* setters and getters */

    // retrieve the full name of the teacher
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
    // set the first name of the teacher
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // set the last name of the teacher
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    // get the subject of the teacher
    public String getSubject() {
        return this.subject;
    }
    // set the subject of the teacher
    public void setSubject(String subject) {
        this.subject = subject;
    }



}
