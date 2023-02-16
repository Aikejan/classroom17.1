public class Teacher extends Person{
    private Student students;

    public Teacher(String firsname, String lastname, int age, String email, String phonenumber,Student students) {
        super(firsname, lastname, age, email, phonenumber);
        this.students = students;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    @Override
    public void myMethod() {
        System.out.println("teacher v otpuske");

    }

    @Override
    public String toString() {
        return "students: " + students+super.toString();
    }
}
