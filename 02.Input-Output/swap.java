//Swap two numbers (using third variable).
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The first number is :");
        int a= sc.nextInt();
        System.out.println("The Second number is :");
        int b= sc.nextInt();
        //before swapping 
        System.out.println("Before swapping")
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        //swap
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}