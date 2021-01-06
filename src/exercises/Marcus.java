package exercises;

public class Marcus {

    public static void main (String [] args) {
        Marcus myFirstMarcus = new Marcus();
        myFirstMarcus.myFirstMethod();
    }
    private String myFirstClassVariable ="This is a string.";

    public Marcus() {

    }
    public void myFirstMethod(){
        System.out.println("Hello, World!");

    }
}
