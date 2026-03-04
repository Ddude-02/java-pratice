import java.util.LinkedHashSet;

public class RemoveDupli{
    public static void main(String[] args) {
        int[] arr=ArrInput.arrayInput();
        removeDuplicate(arr);
    }
    static void removeDuplicate(int[] arr){
         LinkedHashSet<Integer> ls=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            if(ls.contains(a)){
                System.out.print("duplicate: "+a+"\n");
            }
            else{
                ls.add(a);
            }
        }
        System.out.println("\nthe unique elements of the array are:");
        for(int a:ls){
            System.out.print(a+" ");
        }
    }
}
