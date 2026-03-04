import java.util.Scanner;
public class CountVAndC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.nextLine().toLowerCase();
        int vCount=0,cCount=0;
        boolean[] isV=new boolean[26];
        for(char ch1:"aeiou".toCharArray()){
            isV[ch1-'a']=true;
        }
        for(char ch2:str.toCharArray()){
            if(ch2>='a'&&ch2<='z'){
               vCount += isV[ch2 - 'a'] ? 1 : 0;
               cCount += isV[ch2 - 'a'] ? 0 : 1;
            }
        }
        // for(char c:str.toCharArray()){
        //     if(c>='a'&& c<='z'){
        //         if("aeiou".indexOf(c)>=0){
        //             vCount++;
        //         }else{
        //             cCount++;
        //         }
        //     }
        // }
        // for(int i=0;i<str.length();i++){
        //     char ch=str.charAt(i);
        //     if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        //         vCount++;
        //     }else if(ch>='a' && ch<='z'){
        //         cCount++;
        //     }
        // }
        System.out.println("vowels count: "+vCount);
        System.out.println("consonants count: "+cCount);
    }
}
