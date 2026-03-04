import java.util.Scanner;
public class MissingArr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=ArrInput.arrayInput();
        //n*n+1/2 - sum
        int n=arr.length,sum=0;
        for(int i:arr){
            sum+=i;
        }
        int missing=Math.abs((n * (n + 1) / 2) - sum);
        System.out.println("the missing number is:"+missing);

    }
}