import java.util.Scanner;
public class CircleCalculator
{
    public static void main(String[] args)
    {
        System.out.print("Please enter the radius of a circle: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double diameter = radius * 2;
        double circum = diameter * Math.PI;
        double area = (radius * radius) * Math.PI;
        System.out.println("The diameter of the circle with radius " + radius + " is: " + diameter);
        System.out.println("The circumference of the circle with radius " + radius + " is: " + circum);
        System.out.print("The area of the circle with radius " + radius + " is: " + area);
    }
}
