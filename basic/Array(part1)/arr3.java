//this is leaner search code
public class arr3{
    // this is function for element search
    public static int linearSearch(int numbers[],int key){
        for(int i= 0; i<numbers.length ; i++){
            if(numbers[i] == key){
                return i;
            }
        }
         return -1;  
    }
    //main function
    public static void main(String args[]){
        int numbers[]={2,3,46,5,6,9,56,21};
        int key=9;
        int index=linearSearch(numbers,key);
        if(index==-1){
            System.out.print("Value is not found in array");
        }else{
            System.out.println("this value in array Index :" +index);
        }
    }
}