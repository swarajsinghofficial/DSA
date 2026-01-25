public class rp {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i = 0;i<arr.length;i++){
            for(int j = arr.length-1;j>=0;j--){
                arr[i]=arr[j];
                break;

                
            }
        }
        for(int g: arr){
            System.out.println(g);
        }
    
    }
    
}
