package livecodingpractice;

public class Calculator {
    public static int calculate(int num1, char operation, int num2) {
        switch(operation){
            case '+': return num1+num2;
            case '-': return num1-num2;
            case '/': return num1/num2;
            case '*': return num1*num2;
            default: return (num2 == 0) ? 0 : num1/num2;

        }

    }

    public static void main(String[] args) {
        System.out.println(calculate(0,'/',0));
    }

}
