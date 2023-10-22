import java.util.*;
class Sphere{
    int radius;

    public void volume(){
        System.out.println("Volume of Sphere: "+ (4/3)*3.14*(radius*radius*radius));
    }

    public void area(){
        System.out.println("Surface Area of Sphere: "+ 4*3.14*(radius*radius));
    }
}

public class q2_Sphere {
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        Sphere sp = new Sphere();
        System.out.print("Enter The radius: ");
        sp.radius = read.nextInt();

        sp.volume();
        sp.area();
    }
}
