//Find the largest of three numbers.
import java.util.Scanner;
public class largeno{
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        System.out.print("a:");
        int a = sc.nextInt();
        System.out.print("b:");
        int b = sc.nextInt();
        System.out.print("c:");
        int c= sc.nextInt();
        //condition
        if(a>b && a>c){
            System.out.println("A is largest of three numbers");
        }
        else if(b>a && b>c){
            System.out.println("B is largest of three numbers");
        }
        else{
            System.out.println("C is largest of three numbers");
        }
        sc.close();
    }
}