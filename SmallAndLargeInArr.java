public class SmallAndLargeInArr {
    public static void main(String[] args) {
        int[] arr = ArrInput.arrayInput();
        PrintArr.printArray(arr);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        System.out.println("\nthe largest element in the array is:"+max);
        System.out.println("the smallest element in the array is:"+min);
    }
}
