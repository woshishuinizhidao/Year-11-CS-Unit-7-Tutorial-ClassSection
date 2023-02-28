public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    static int studentCount;

    public Student(String f, String l, int a, int y){
        firstName = f;
        lastName = l;
        age = a;
        yearLevel = y;
    }

    public int getId(){return id;}
    public String getFirstName(){return firstName;}
    public void setFirstName(String firstName){this.firstName=firstName;}
    public String getLastName(){return lastName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}
    public int getYearLevel(){return yearLevel;}
    public void setYearLevel(int yearLevel){this.yearLevel= yearLevel;}
    public int getStudentCount(){return studentCount;}
    public boolean equals(Student student){
        boolean equals = false;
        if(getId()==student.getId()){
            equals = true;
        }
        return equals;
    }

    public String toString(){
        return "Student{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "', age=" + age +"}";
    }

}
