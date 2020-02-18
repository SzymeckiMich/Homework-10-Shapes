public class Rectangle extends GeometricShape {
    private double length_A;
    private double length_B;

    public Rectangle(double length_A, double length_B) {
        this.length_A = length_A;
        this.length_B = length_B;
    }

    public double getLength_A() {
        return length_A;
    }

    public double getLength_B() {
        return length_B;
    }
}
