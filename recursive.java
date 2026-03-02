import java.util.Scanner;

public class recursive {
    public static void main(String[] args) {
        //print 1 to n using recursion
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the stating and ending numbers:");
        int st=sc.nextInt();
        int end=sc.nextInt();
        printNumbers(st,end);

    }
    static void printNumbers(int st,int end){
        if(st>end){
            return;
        }
        System.out.println(st);
        printNumbers(st+1,end);
    }
}
