import java.util.Scanner;
public class StringRev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        sb=sb.reverse();
        // String rev="";
        // for(int i=str.length()-1;i>=0;i--){
        //     char ch=str.charAt(i);
        //     rev+=ch;
        // }
        System.out.println("the reversed string is:\n"+sb.toString());
    }
    
}
