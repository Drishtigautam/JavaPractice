import java.util.*;
 
 public class Array{
    
    public static void main(String[] args){
     int[] marks = new int[3];
      marks[0]= 23;
      marks[1]= 24;
      marks[2]= 22;

      //System.out.println(marks[2]);

      //instead of printing all element one by one use loops

      for(int i=0; i<=2; i++){
        System.out.println("List of Marks: "+ marks[i]);
      }
    }
 }