public class ReverseArray {
    public static void Reverse(int [] arr){
        int i = 0 ;
        int j = arr.length - 1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int [] arr = {10,34,43,54,56};
        for (int e: arr){
            System.out.print(e+ " ");
        }
        System.out.println();

        Reverse(arr);
        for (int r:arr){
            System.out.print(r+ " ");
        }
    }
    
}
