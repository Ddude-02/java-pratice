import java.util.Scanner;
public class Swap2num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 2 nums:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("before swapping the numbers are:"+n1+" and "+n2);
        // int n1=n1+n2;
        // int n2=n1-n2;       
        // int n1=n1-n2;
        // n1=n1^n2;
        // n2=n1^n2;
        // n1=n1^n2;
        int temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("after swapping the numbers are:"+n1+" and "+n2);
    }
}
