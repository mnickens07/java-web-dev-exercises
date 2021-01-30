package exercises.chapter4exercises.school;

public class Student {
    public static void main (String[]args) {
        Student myself = new Student("Marcus", 1, 89, 3.6);
        Student myTwin = new Student("Marcus", 2, 89, 3.6);
        Teacher newTeacher = new Teacher();
        Course myFirstCourse = new Course("College Algebra ", 3);
        Course mySecondCourse = new Course("Calculus ", 5);
//        System.out.println(myFirstCourse.equals(mySecondCourse));
//        String myGradeLevel = myself.getGradeLevel();
//        System.out.println(myGradeLevel);
//        myself.addGrade(5, 4.0);
//        System.out.println(myself.gpa);
//        String myGpa = myself.toString();
//        System.out.println(myGpa);
//        System.out.println(myself.equals(myTwin));
        System.out.println(mySecondCourse.toString());

    }

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }
    public void addGrade(int courseCredits, double grade) {
//        Update the appropriate fields: numberOfCredits, gpa
        double currentTotalQualityScore = this.numberOfCredits * this.gpa;
        double newQualityScore = courseCredits * grade;
        double newTotalQualityScore = currentTotalQualityScore + newQualityScore;

        int newTotalCredits = courseCredits + this.numberOfCredits;
        this.numberOfCredits = newTotalCredits;

        double newGpa = newTotalQualityScore/newTotalCredits;
        this.gpa = newGpa;

    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if(this.numberOfCredits<=29 && this.numberOfCredits>=0) {
            return "Freshman";
        }
        else if(this.numberOfCredits<=59 && this.numberOfCredits>=30) {
            return "Sophomore";
        }
        else if(this.numberOfCredits<=89 && this.numberOfCredits>=60) {
            return "Junior";
        }
        else if(this.numberOfCredits>=90) {
            return "Senior";
        } else {
        return null;
        }
    }

    @Override
    public String toString() {
        return this.name + ": " + this.gpa;
    }

    @Override
    public boolean equals(Object obj) {
        if((obj instanceof Student)==false) return false;
        Student myStudentObj = (Student) obj;
        if (myStudentObj.name.equals(this.name))return true;
        else return false;
    }

    /* getters and setters omitted */
    public String getName (){return this.name;}
    public void setName(String name){this.name=name;}

    public int getStudentId (){return this.studentId;}
    private void setStudentId(int studentId){this.studentId=studentId;}

    public int getNumberOfCredits (){return this.numberOfCredits;}
    public void setNumberOfCredits(int numberOfCredits){this.numberOfCredits=numberOfCredits;}

    public double getGpa (){return this.gpa;}
    public void setGpa(double gpa){this.gpa=gpa;}
}

