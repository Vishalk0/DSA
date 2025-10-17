import java.util.*;
public class fun{
public static void main(){
Scanner obj = new Scanner(System.in);
int a =obj.nextInt();
int b=obj.nextInt();
int sum=calculate(a,b);//this parameter is called actual parameter
System.out.println("Sum is =" + sum);

}
//other function 
public static int printer(){
    System.out.println("Hello World");
System.out.println("Hello World");
System.out.println("Hello World");
return 3;
}
//prameter practice of function
//here define parameter are called formal parameter
public static int calculate(int num1, int num2){
    int sum=num1+num2;
return sum;
}

}