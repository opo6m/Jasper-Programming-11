
public class Main {
    public static void main(String[] args) {
        // 10 students
        Student billGates = new Student("Bill","Gates",9);
        Student gregAdams = new Student("Greg","Adams",8);
        Student jimmyLee = new Student("Jimmy","Lee",11);
        Student noahLangford = new Student("Noah","Langford",9);
        Student johnMill = new Student("John","Mill",10);
        Student emilyLam = new Student("Emily","Lam",11);
        Student sarahBuffet = new Student("Sarah","Buffet",10);
        Student graceMichaels = new Student("Grace","Michaels",10);
        Student georgeWashington = new Student("George","Washington",12);
        Student georgiaSmith = new Student("Georgia","Smith",12);

        // 3 teachers
        Teacher williamJones = new Teacher("William","Jones","Physics");
        Teacher aliceChow = new Teacher("William","Chow","Biology");
        Teacher maryWindsor = new Teacher("William","Windsor","English");

        // school object
        School killarney = new School("Killarney",20,"Kal Gill");

        // add teachers
        killarney.addStudent(billGates);
        killarney.addStudent(gregAdams);
        killarney.addStudent(jimmyLee);
        killarney.addStudent(noahLangford);
        killarney.addStudent(johnMill);
        killarney.addStudent(emilyLam);
        killarney.addStudent(sarahBuffet);
        killarney.addStudent(graceMichaels);
        killarney.addStudent(georgeWashington);
        killarney.addStudent(georgiaSmith);

        killarney.addTeacher(williamJones);
        killarney.addTeacher(aliceChow);
        killarney.addTeacher(maryWindsor);

        // display students and teachers
        System.out.println(killarney.showStudents());
        System.out.println(killarney.showTeachers());

        // remove 2 students and 1 teacher
        killarney.removeStudent(jimmyLee);
        killarney.removeStudent(georgeWashington);
        killarney.removeTeacher(williamJones);

        // display students and teachers again
        System.out.println("------------------------------------------------------------------");
        System.out.println(killarney.showStudents());
        System.out.println(killarney.showTeachers());



    }

}
