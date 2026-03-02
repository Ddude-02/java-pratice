import java.util.Scanner;
public class LargestOf2Nums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 2 nums:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int result=(n1>n2)?n1:n2;
        System.out.println("the largest of 2 giving numbers is:"+result);
    }
}
