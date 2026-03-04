import java.util.Arrays;
import java.util.Scanner;
public class Anagramstr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string:");
        char[] str1=sc.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]","").toCharArray();
        System.out.println("enter the second string:");
        char[] str2=sc.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]","").toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        String res=Arrays.equals(str1,str2)?"the strings are anagrams":"the strings are not anagrams";
        System.out.println(res);

    }
    
}
