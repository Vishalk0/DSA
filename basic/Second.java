import java.util.*;
 class Second {
    public static void main(String[]args)
    {

       int a ; int b;
        System.out.println("Enter the value");
       Scanner obj =new Scanner(System.in);
       a=obj.nextInt();
       b=obj.nextInt();
      int c = a + b ;
       System.out.println(c);
       System.out.println("Sub = "+(a-b));
       System.out.println("Multi = "+(a*b));
       System.out.println("Divided = "+(a/b));
       System.out.println("Print"+ a);
       System.out.println( "Increament = "+ a++);
       
       System.out.println("Decreatment = "+ ++a);
    }
 }