import java.util.Arrays;
public class ArrSort {
    public static void main(String[] args) {
        int[] arr=ArrInput.arrayInput();
        Arrays.sort(arr);
        PrintArr.printArray(arr);   
    }
}
