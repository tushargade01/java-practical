public class q4_array {
    public static void main(String args[]){
        int arr[][] = {{1,2,3},{4,5,6}};
        int row = arr.length;
        int column = arr[0].length;
        
        int[][] newarr =new int[column][row];
        System.out.println("Before Changing row & columns: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                newarr[j][i]=arr[i][j];
            }
        }
        
        System.out.println("After Changing row & columns: ");
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                System.out.print(" "+newarr[i][j]);
            }
            System.out.println();
        }
    }
}
