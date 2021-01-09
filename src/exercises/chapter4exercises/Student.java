package exercises.chapter4exercises;

public class Student {

//    class variables
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;
//    class constructors
public Student(String name, int studentId, int numberOfCredits, double gpa){
    this.name=name;
    this.studentId=studentId;
    this.numberOfCredits=numberOfCredits;
    this.gpa=gpa;
}
//    methods
    public String getName(){
    return name;
    }
    public void setName(String aName) {
        name = aName;
    }
    public int getStudentId(){
        return studentId;
    }
    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }
    public int getNumberOfCredits(){
        return numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }
    public double getGpa(){
        return gpa;
    }
    private void setGpa(double aGpa) {
        gpa = aGpa;
    }
}
