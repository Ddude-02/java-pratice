import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        String r=(num%2==0)?"even":"odd";
        System.out.println("the given number is:"+r);

    }
}
