import java.util.Scanner;
public class PrimeNumb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        if(isPrime(num)){
            System.out.println("the given number is prime");
        }
        else{
            System.out.println("the given number is not prime");
        }
    }
    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    return false;
                }
            }
        return true;
    }
}

