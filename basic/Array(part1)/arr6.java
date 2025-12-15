public class arr6{
    //this function is used to reverse of element...
    public static void reverse(int arr[]){
 int start=0; int end=arr.length-1;
 while(start<end){
    //this is used to swap the value in array..
    int temp=arr[end];
    arr[end]=arr[start];
    arr[start]=temp;
    //this used increasing the index value of coding..
    start++;
    end--;
 }
    }
    public static void main(String[] args){
        int arr[]={2,4,6,7,8,9};
        reverse(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}