public class ArrayReverseRec {
    public static void Rev(int[] arr,int i,int j){
        
        if(i>j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
        
        Rev(arr,i+1,j-1);
        

    }
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int i = 0;
        int j = arr.length-1;
        Rev(arr,i,j);
        for (int p: arr){
            System.out.print(p + " ");
        }

        
    }
    
}
