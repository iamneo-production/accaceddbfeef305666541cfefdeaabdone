import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    public Student(){

    }
    public Student(int studentId, String firstname, String lastName){
        this.firstName = firstname;
        this.lastName = lastName;
        this.studentId = studentId;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getStudentId(){
        return studentId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}
