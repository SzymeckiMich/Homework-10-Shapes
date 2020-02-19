public class InfoPrinter {

    public static void printShapesInfo(Shape[] shapes) {
        ShapeCalculator calculator = new ShapeCalculator();

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Line2D) {
                System.out.println("Odcinek wyznaczony przez współrzędne [" + ((Line2D) shapes[i]).getStart_X() + ", " +
                        ((Line2D) shapes[i]).getStart_Y() + "] [" + ((Line2D) shapes[i]).getEnd_X() + " ," +
                        ((Line2D) shapes[i]).getEnd_X() + "] ma długośc " + calculator.lineLength((Line2D) shapes[i]));
            } else if (shapes[i] instanceof Shape2D) {
                if (shapes[i] instanceof Rectangle) {
                    System.out.println("Prostokąt o bokach " + ((Rectangle) shapes[i]).getLength_A() + " i" +
                            ((Rectangle) shapes[i]).getLength_B() + " ma pole, które wynosi " +
                            calculator.shapeArea((GeometricShape) shapes[i]));
                } else {
                    System.out.println("Koło o promieniu " + ((Circle) shapes[i]).getRadius() + " ma pole, które wynosi " +
                            calculator.shapeArea((GeometricShape) shapes[i]));
                }
            } else {
                if (shapes[i] instanceof Cube) {
                    System.out.println("Sześcian o długości krawędzi wynoszącej " + ((Cube) shapes[i]).getEdgeLength()
                            + " ma objętość " + calculator.volume((Shape3D) shapes[i]));
                } else {
                    System.out.println("Kula o promieniu " + ((Ball) shapes[i]).getRadius() + " ma objętośc wynoszącą "
                            + calculator.volume((Shape3D) shapes[i]));
                }
            }
        }
    }


}
