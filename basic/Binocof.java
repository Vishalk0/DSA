import java.util.*;
public class Binocof{
    public static void main(String[] args){
        System.out.println("Please Enter the value of n and r ");
        int result = binocof();
        System.out.println(result);

    }
    public static int binocof(){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int r=obj.nextInt();

        int binoN = factorial(n);
        int binoR = factorial(r);
         int binonmr=factorial(n-r);
         int binoResult=binoN/(binoR*binonmr);
         
        return binoResult;
    }
    public static int factorial(int num){
         int f=1;
         for(int i=1;i<=num;i++){
            f=f*i;
         }
         return f;
    }

}