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
    public int setStudentId(int studentId){
        this.studentId = studentId;
    }
}
