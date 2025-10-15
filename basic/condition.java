import java.util.*;
public class condition{
    public static void main(String[]args){
        int a;
        System.out.println("enter the value");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        if(a>=0){
            System.out.println("Positive number..");
            if(a==0){
                System.out.println("Zero number..");
            }
        }
        else{
            System.out.println("Negative Number");
        }
    }
}