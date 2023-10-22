import java.util.*;
public class q3_cities {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number of cities you wanna add: ");
        int n = read.nextInt();
        String[] arr = new String[n]; 
        System.out.println("Enter Name of Cities: ");
        for(int i=0;i<n;i++){
            arr[i] = read.nextLine();
        }

        Arrays.sort(arr);
        System.out.println("Ascending Order Cities: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
