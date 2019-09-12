public class FirstCircleMaker
{
    public static void main(String[] args)
    {
        InClassCircle c1 = new InClassCircle();
        System.out.println("radius is: " + c1.getRadius());
        System.out.println("area is: " + c1.calcArea());
        System.out.println("diameter is: " + c1.calcDiameter());
        System.out.println("circumference is: " + c1.calcCircumference());
    }
}
