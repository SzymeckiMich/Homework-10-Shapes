public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {


    @Override
    public double shapeArea(GeometricShape shape) {
        if (shape instanceof Circle) {
            return Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
        } else {
            return ((Rectangle) shape).getLength_B() * ((Rectangle) shape).getLength_A();
        }
    }

    @Override
    public double volume(Shape3D shape) {
        if (shape instanceof Ball) {
            return (4 / 3) * Math.PI * Math.pow(((Ball) shape).getRadius(), 3);
        } else {
            return Math.pow(((Cube) shape).getEdgeLength(), 3);
        }
    }
}