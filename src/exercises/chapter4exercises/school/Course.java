package exercises.chapter4exercises.school;

import exercises.chapter4exercises.Student;

import java.util.HashMap;

public class Course {
//    class variables
    private HashMap<String, Integer> courseName;
    private String name;
    public Student marcus;

//    class constructors
    public Course(HashMap<String, Integer> courseName, String name, Student marcus ){
        this.courseName=courseName;
        this.name=name;
        this.marcus=marcus;

    }

//    methods
    public HashMap getCourseName(){
        return courseName;
}
    public void setName(String aName) {
        name = aName;
    }
    public Student getMarcus(){
        return marcus;
    }
    public void setMarcus(String aMarcus) {
//        Student = aMarcus;
    }
}
