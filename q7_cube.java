import java.util.*;
interface Cube{
    double findCube(double number);
}
class calculateCube implements Cube{
    @Override
    public double findCube(double number){
        return number*number*number;
    }
}
public class q7_cube {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double number = reader.nextDouble();
        
        Cube cube = new calculateCube();
        double result = cube.findCube(number);

        System.out.println("Given number Of Cube is: "+result);
    }
}
