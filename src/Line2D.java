public class Line2D extends Shape2D {
    private double start_X;
    private double start_Y;
    private double end_X;
    private double end_Y;

    public Line2D(double start_X, double start_Y, double end_X, double end_Y) {
        this.start_X = start_X;
        this.start_Y = start_Y;
        this.end_X = end_X;
        this.end_Y = end_Y;
    }

    public double getStart_X() {
        return start_X;
    }

    public double getStart_Y() {
        return start_Y;
    }

    public double getEnd_X() {
        return end_X;
    }

    public double getEnd_Y() {
        return end_Y;
    }
}
