import java.util.*;
 class Switchh{
    public static void main(String[]args){

        System.out.println("Enter any number :");
        Scanner obj=new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int ch;
        System.out.println("a = " + a);
        System.out.println("a = " + b);
        switch()
        {
            case 1 : System.out.println("a = "+ (a+b));
            break;
            case 2 : System.out.println("a = "+ (a-b)); 
            break;
            default :System.out.println("invalid output");
        }
        
    }
}