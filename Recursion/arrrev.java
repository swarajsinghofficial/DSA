import java.util.*;
public class arrrev {
    public static void reverseArray(int arr[]) {
        // code here
        int i =0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
        
        
    }
    public static void main(String[] args) {
        int [] arr = {10,20,40,50,60};
        reverseArray(arr);
    }
}
    

