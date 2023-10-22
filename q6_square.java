import java.util.*;
interface Square{
    double calculateSquare(double number);
}
class findSquare implements Square{
    @Override
    public double calculateSquare(double number){
        return number*number;
    }
}
public class q6_square {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        Square square = new findSquare();

        System.out.print("Enter the number: ");
        double number = reader.nextDouble();

        double result = square.calculateSquare(number);

        System.out.println("Given area of Square is: "+result);

    }
}
