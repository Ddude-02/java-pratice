import java.util.Scanner;

public class PosOrNegOrZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        if(num==0){
            System.out.println("the given number is zero");
        }
        else if(num>0){
            System.out.println("the given number is positive");
        }
        else{
            System.out.println("the given number is negative");
        }
    }
}
