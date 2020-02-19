public class Test {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[10];

        shapes[0] = new Ball(5);
        shapes[1] = new Circle(3);
        shapes[2] = new Line2D(1, 2, 1, 5);
        shapes[3] = new Rectangle(4, 5);
        shapes[4] = new Cube(6);
        shapes[5] = new Ball(14);
        shapes[6] = new Circle(33);
        shapes[7] = new Line2D(41, 2, 1, 5);
        shapes[8] = new Rectangle(41, 5);
        shapes[9] = new Cube(16);

        InfoPrinter.printShapesInfo(shapes);


    }

}
