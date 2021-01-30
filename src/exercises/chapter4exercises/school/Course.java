package exercises.chapter4exercises.school;

import java.util.ArrayList;

public class Course {
//    class variables
    private String courseName;
    private Integer numberOfCredits;
    private ArrayList<Student> studentList;

//  Constructors
public Course(String courseName, Integer numberOfCredits){
    this.courseName=courseName;
    this.numberOfCredits=numberOfCredits;
}


    @Override
    public String toString() {
        return this.courseName + "is worth " + this.numberOfCredits + " credit hours.";
    }

    @Override
    public boolean equals(Object obj) {
        if((obj instanceof Course)==false) return false;
        Course myCourseObj = (Course) obj;
        if (myCourseObj.numberOfCredits.equals(this.numberOfCredits))return true;
        else return false;
    }
}
