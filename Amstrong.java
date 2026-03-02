import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isAmstrong(num)){
            System.out.println("the given number is amstrong");
        }
        else{
            System.out.println("the given number is not amstrong");
        }
    }
    static boolean isAmstrong(int num){
        int temp=num,sum=0;
        while(temp!=0){
            int tem=temp%10;
            sum+=tem*tem*tem;
            temp/=10;
        }
        return sum==num;
    }
}
