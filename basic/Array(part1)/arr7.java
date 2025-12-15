//find the pair of array ..
public class arr7{

    public static void pairs(int numbers[]){
        int totalpairs =0;
        for(int i=0; i<numbers.length;i++){
           int curr=numbers[i];
            for(int j=i+1; j<numbers.length;j++){
                System.out.print("(" + curr + "," + numbers[j] +")");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.print("Total Pairs of ="+totalpairs);
    }
 public static void main(){
    int numbers[]={2,4,6,8,10};
    pairs(numbers);
 }
}