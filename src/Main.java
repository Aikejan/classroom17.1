public class Main {
    public static void main(String[] args) {
        Student student = new Student("Vera", "Kulikova", 20, "verakulikova@gmail.com", "998456784", "JS" );
        Student student1 = new Student("Acan", "Turatov", 21, "acanturatov@gmail.com", "550987654", "Java-9");
        Teacher teacher = new Teacher("Samat", "Chegirova", 22, "samatchegirov@gmail.com", "554270890", student1 );
        Teacher teacher1 = new Teacher("Rima","Ormonova",23,"rimaormonova@gmail.com","550987654",student);

        Teacher[] teachers ={teacher,teacher1};
        for (Teacher a:teachers){
            System.out.println(a.getStudents());
            student.myMethod();
            teacher.myMethod();


        }

    }
}








