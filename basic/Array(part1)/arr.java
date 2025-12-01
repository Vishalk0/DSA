import java.util.*;
class arr{
    public static void main(String args[]){
        //creating a array and declare size also...
        int marks[]=new int[50];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks.");
         marks[0] = sc.nextInt();
         marks[1] = sc.nextInt();
         marks[2] = sc.nextInt();
        System.out.println("PHY :"+marks[0]);
        System.out.println("CHE :"+marks[1]);
        System.out.println("MATH :"+marks[2]); 
    }
}