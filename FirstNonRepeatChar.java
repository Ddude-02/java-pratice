import java.util.HashMap;
import java.util.Scanner;
public class FirstNonRepeatChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.nextLine();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(hm.get(ch)==1){
                System.out.println("first non repeating character: "+ch);
                return;
            }
        }
        System.out.println("no non repeating character found");
    }
}
