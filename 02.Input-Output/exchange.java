//Swap two numbers (without third variable).
import java.util.Scanner;
public class exchange {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("a:");
        int a = sc.nextInt();
        System.out.println("b:");
        int b = sc.nextInt();
        //swapping 
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap");
        System.out.println("a:"+a);
        System.out.println("b:"+b);

    }
}