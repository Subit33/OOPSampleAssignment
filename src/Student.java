public class Student {
    private String fullName;
    private int studentID;
    private String gender;

    public Student(String fullName, int studentID, String gender){
        this.fullName = fullName;
        this.studentID =studentID;
        this.gender = gender;
    }

    public String getFullName(){
        return fullName;
    }

    public int getStudentID(){
        return studentID;
    }

    public String getGender(){
        return gender;
    }

}
