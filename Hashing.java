import java.util.*;
import java.util.Iterator;


public class Hashing{
    /*hashing does not contains duplicate element so adding 2 similar no. in hashset it will remove the distinct */
     // hashset are unordered
    public static void main(String[] args){
        //Creating
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //Search- contains
        if(set.contains(1)){
          
          System.out.println("Contains 1");
        } 

        if(!set.contains(5)){
            System.out.println("does not contains");
        }

        //Delete 
        // set.remove(1);
        // if(!set.contains(1)){
        //     System.out.println("we deleted 1");
        // }

        //size of set
        System.out.println("Size of set: "+ set.size());

        //print all elements of set
        System.out.println(set);

        //to iterate in set u need to import iterator it does not use loop
        Iterator it = set.iterator();
        //Two function in Iterator (hasNext, next)
        // next point the next element
        //hasNext use true false to indicate that next element exist
        // no need for increment and decrement operator

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
