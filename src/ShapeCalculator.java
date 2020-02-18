public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {
    @Override
    public double circleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getLength_A() * rectangle.getLength_B();
    }

    @Override
    public double ballVolume(Ball ball) {
        return (4 / 3) * Math.PI * Math.pow(ball.getRadius(), 3);
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getEdgeLength(), 3);
    }
}
