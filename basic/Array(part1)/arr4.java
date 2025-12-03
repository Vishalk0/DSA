import java.util.*;
//this code is find the largest value in array 
public class arr4{
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0 ; i<numbers.length ; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int numbers[]={2,5,8,3,9,23,54};
        System.out.print("This is largest Value = " +getLargest(numbers));
        
    }
}