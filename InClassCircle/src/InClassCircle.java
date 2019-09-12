public class InClassCircle {

    private double radius;

    public InClassCircle() {
        this.radius = 1;
    }

    public InClassCircle(double myRadius) {
        this.radius = myRadius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public double calcDiameter() {
        return 2 * this.radius;
    }

    public double calcCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public double calcArea() {
        return Math.PI * this.radius * this.radius;
    }
}