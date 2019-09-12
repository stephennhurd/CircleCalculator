import java.util.*;
public class SecondCircleMaker
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your radius: ");
        double secondCircleRadius = sc.nextDouble();
        InClassCircle c2 = new InClassCircle(secondCircleRadius);

        System.out.printf("radius is: %.2f %n", c2.getRadius());
        System.out.printf("area is: %.2f %n", c2.calcArea());
        System.out.printf("diameter is: %.2f %n", c2.calcDiameter());
        System.out.printf("circumference is: %.2f %n", c2.calcCircumference());

        System.out.printf("Hello %s!%n", "World");
    }
}
