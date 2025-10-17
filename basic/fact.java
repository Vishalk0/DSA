import java.util.*;
class fact{
    public static void main(String[] args){
         System.out.println("Enter the value of N : " );
       int result=factorial();
       System.out.println(result);
    }
    public static int factorial(){
        Scanner obj= new Scanner(System.in);
        int n =obj.nextInt();
        int f=1;
        System.out.println("result of Factorial : ");
        for(int i=1;i<=n;i++) {
            f=f*i;
        }
        return f;
    }
}