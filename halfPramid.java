class halfPramind{
    public static void main(String[] args){
        HelloRec(4,4);
    }
public static int HelloRec(int totr,int totc){
    for(int i=1;i<=totr;i++){
        for (int j=1;j<=totc;j++){
            if(totr==1||totr==4||totc==1||totc==4){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    return 0;
}

}
