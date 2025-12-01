class arr2{
    //this is define update function for array value increase
     public static void update(int marks[]){
 for(int i=0; i<marks.length; i++){
    marks[i]=marks[i]+1;
}
    }
    //this is main function
    public static void main(String args[]){
  int marks[] = {78,67,94}; 
  //call the function
  update(marks);
  for(int i=0; i<marks.length; i++){
    System.out.print(marks[i]+" ");
  }
  System.out.println();
    }
   
}