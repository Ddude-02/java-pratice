public class ReverseArr {
    public static void main(String[] args) {
        int[] arr=ArrInput.arrayInput();
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        PrintArr.printArray(arr);
    }
}
