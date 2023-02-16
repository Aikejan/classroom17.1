public abstract class Person {
    private String firsname;
    private  String lastname;
    private  int age;
    private String email;
    private String phonenumber;
    public abstract  void myMethod();

    public Person(String firsname, String lastname, int age, String email, String phonenumber) {
        this.firsname = firsname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    public String getFirsname() {
        return firsname;
    }

    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return
                "firsname: " + firsname +
                "  lastname: " + lastname +
                "  age: " + age +
                " email: " + email +
                " phonenumber:" + phonenumber ;
    }
}
