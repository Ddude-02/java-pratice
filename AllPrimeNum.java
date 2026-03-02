import java.util.Scanner;

public class AllPrimeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int start=sc.nextInt();
        int end=sc.nextInt();
        System.out.println("the prime numbers between "+start+" and "+end+" are:");
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        
    }
    
        static boolean isPrime(int n){
            if(n<=1){
                return false;
            }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
}
