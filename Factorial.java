import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        //iterative approach
        // int fact=1;
        // for(int i=1;i<=n;i++){
        //     fact*=i;
        // }
        //recursive approach
        int fact=fact(n);
        System.out.println("factorial of "+n+" is "+fact);
    }
    static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
