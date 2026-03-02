import java.util.Scanner;
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year:");
        int year=sc.nextInt();
        String r=(year%4==0 && year%100!=0 ||year%400==0)?"leap year":"not a leap year";
        System.out.println("the given year is:"+r);
    }
}
