import java.util.Scanner;

public class MulTableOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        System.out.println("the multiplication table of "+num+" is:");
        multiplicationTable(num);
    }
    static void multiplicationTable(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
