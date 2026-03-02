import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms:");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println("fibonacci series:");
        //iterative approach
        // for(int i=1;i<=n;i++){
        //     System.out.print(a+" ");
        //     int c=a+b;
        //     a=b;
        //     b=c;
        // }
        fib(n, a, b);
    }
    static void fib(int n,int a,int b){
        if(n==0){
            return;
        }
        System.out.print(a+" ");
        fib(n-1,b,a+b);
    }
}
