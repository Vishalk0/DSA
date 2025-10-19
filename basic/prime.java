
public class prime{
    public static void main(String[]args){
     boolean number=isprime(8);
     System.out.println(number);
    }
    public static boolean isprime(int n){
     boolean isprime=true;
        for (int i=2;i<=n-1;i++){
            if(n % i==0){
                isprime = false;
            }
        }
        return isprime;
    }
}