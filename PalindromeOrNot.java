import java.util.Scanner;
public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
     if(ispalindrome(num)){
        System.out.println("the given number is palindrome");
     }
        else{
            System.out.println("the given number is not palindrome");
        }
    }
    static boolean ispalindrome(int num){
        int rev=0,temp=num;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp/=10;
        }
        return rev==num;
    }
}
