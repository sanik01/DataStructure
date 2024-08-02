public class subArray {
    public static void main(String[]args){
      

     int ary[] = {1,2,3,4,5};
        int length = ary.length;
        for(int row=0; row<length; row++){
            for(int col=row; col< length; col++){
                for(int current = row; current<=col; current++){
                    System.out.print(ary[current]+"\t");
                }
                System.out.println();
            }
        }
    }
}
