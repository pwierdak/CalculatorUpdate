import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        cal.addition(7,1);
        System.out.println(cal.addition(7,1));
        System.out.println(cal.substraction(6,5));
        System.out.println(cal.multiplication(5, 6));
        System.out.println(cal.division(30, 5));
    }
}

