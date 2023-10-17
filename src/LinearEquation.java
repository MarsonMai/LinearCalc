public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public LinearEquation(int x1,int y1,int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.0;
    }
    public double distance() {
        double x = Math.sqrt((Math.pow(x2 - x1,2)) + Math.pow(y2 - y1,2));
        return roundedToHundredth(x);
    }
    public double yIntercept() {
        double yChange = y2 - y1;
        double xChange = x2 - x1;
        double yInt1 = (yChange / xChange * x2 - y2);
        return roundedToHundredth(yInt1);
    }
    public double slope() {
        double yChange = y2 - y1;
        double xChange = x2 - x1;
        return roundedToHundredth((yChange/xChange));
    }
    public String equation() {
        if (y2 == y1) {
            return "y = " + yIntercept();
        } else {
            return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x" + " + " + Math.abs(yIntercept());
        }
    }
    public String coordinateForX(double x) {
        return "(" + x + "," + ((slope() * x) + Math.abs(yIntercept())) + ")";
    }
    public String LineInfo() {
        if (x2 != x1) {
            String str = "The 2 points are: " + "(" + x1 + "," + y1 + ")" + " and " + "(" + x2 + "," + y2 + ")\n";
            str += "The equation of the line between these points is: " + equation() + "\n";
            str += "The slope of the line is: " + slope() + "\n";
            str += "The y-int of the line is: " + Math.abs(yIntercept()) + "\n";
            str += "The distance between these two lines is " + distance();
            return str;
        } else {
            String str = "The 2 x values are equal so its undefined!";
            return str;
        }
    }
}
