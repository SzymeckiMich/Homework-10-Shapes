public class LineCalc {
    public double lineLength(Line2D line){
        return Math.sqrt(Math.pow(line.getEnd_X()-line.getStart_X(),2)+Math.pow(line.getEnd_Y()-line.getStart_Y(),2));
    }
}
