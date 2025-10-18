//function overloading
public class overload{
    public static void main(String[] args){
        System.out.println("Sum = " + sum(5,6));
        System.out.println("Sum = " + sum(3.6f,4.1f));

    }
    public static int sum (int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
}