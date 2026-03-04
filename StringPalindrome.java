import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.nextLine().toLowerCase();
        // StringBuilder sb=new StringBuilder(str);
        // sb=sb.reverse();
        //two pointer approach
        int s=0,e=str.length()-1;
        boolean isPalindrome=true;
        while(s<=e){
            if(str.charAt(s)!=str.charAt(e)){
                isPalindrome=false;
                break;
            }
            s++;
            e--;
        }
        
        //terinary operator
        String res=isPalindrome? "the string is palindrome":"the string is not palindrome";
        System.out.println(res);

    }
}
