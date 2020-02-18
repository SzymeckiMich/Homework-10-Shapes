public class Test {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();
        Ball ball = new Ball(5);
        Circle circle = new Circle(3);
        Line2D line = new Line2D(1, 2, 1, 5);
        Rectangle rectangle = new Rectangle(4, 5);
        Cube cube = new Cube(6);

        System.out.printf("Volume of cube = %.2f\n", calculator.cubeVolume(cube));
        System.out.printf("Volume of ball = %.2f\n", calculator.ballVolume(ball));

        System.out.printf("Field of rectangle = %.2f\n", calculator.rectangleArea(rectangle));
        System.out.printf("Field of circle = %.2f\n", calculator.circleArea(circle));
        System.out.printf("Length of line = %.2f\n", calculator.lineLength(line));
        


    }
}
