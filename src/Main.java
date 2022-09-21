import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! What do you want to do?\nSelect:\n1.addition\n2.substraction\n3.multiplication\n4.division");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please, enter first value.");
        float x= scanner.nextFloat();
        System.out.println("Please, enter second value.");
        float y= scanner.nextFloat();
        int select= scanner.nextInt();
        switch (select){
            case 1:
                System.out.println("result " + (x+y));
                break;
            case 2:
                System.out.println("result " + (x-y));
                break;
            case 3:
                System.out.println("result " + (x*y));
                break;
            case 4:
                System.out.println("result " + (x/y));

        }
    }
}