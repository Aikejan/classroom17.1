public  class Student extends Person{
    private String groub;

    public Student(String firsname, String lastname, int age, String email, String phonenumber, String groub) {
        super(firsname, lastname, age, email, phonenumber);
        this.groub = groub;
    }




    public String getGroub() {
        return groub;
    }

    public void setGroub(String groub) {
        this.groub = groub;
    }

    @Override
    public void myMethod() {
        System.out.println(" student uchitcya");

    }

    @Override
    public String toString() {
        return "groub: " + groub + super.toString() ;
    }
}

