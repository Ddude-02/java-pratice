import java.util.Scanner;
public class LargestOf3Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 3 nums:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println("the largest of 3 giving numbers is:"+n1);
        }
        else if(n2>n1 && n2>n3){
            System.out.println("the largest of 3 giving numbers is:"+n2);
        }
        else{
            System.out.println("the largest of 3 giving numbers is:"+n3);
        }
    }
}
