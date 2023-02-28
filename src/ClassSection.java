import java.util.*;
public class ClassSection {
    private String subject;
    private int capacity;
    private int yearLevel;
    ArrayList<Student> student;

    public ClassSection(String s, int c, int y){
        subject = s;
        capacity = c;
        yearLevel = y;
    }

    public String getSubject(){return subject;}
    public void setSubject(String s){
        subject = s;
    }
    public int getCapacity(){return capacity;}
    public void setCapacity(int c){
        capacity = c;
    }

    public int getYearLevel(){return yearLevel;}
    public void setYearLevel(int y){yearLevel = y;}
    public ArrayList getStudent(){return student;}
    public void addStudent(Student student){
        this.student.add(student);
    }

    public void removeStudent(Student student){
        this.student.remove(student);
    }

    public boolean isStudentEnrolled(Student student){
        boolean found = false;
        if(Collections.frequency(this.student,student)>=1){
            found = true;
        }
        return found;
    }
}
