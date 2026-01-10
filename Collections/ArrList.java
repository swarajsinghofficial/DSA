import java.util.ArrayList;
import java.util.Collections;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(32); // Adds element to ArrayList
        myList.add(30);
        myList.add(10);

        System.out.println(myList);

        myList.remove(1); // remove element from arraylist
        System.out.println(myList);

        myList.get(1); //Access element from arraylist
        myList.set(0,45); //changes the value of element
        myList.size(); //returns the size of the arraylist

        Collections.sort(myList);
        for (Integer i : myList){
            System.out.println( "elements of ArrayList" + i);
        }



    }
    
}
