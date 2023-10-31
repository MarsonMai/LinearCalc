
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
        double change = (yChange / xChange);
        double c = y2-(change * x2);
        return roundedToHundredth(c);
    }
    public double slope() {
        double yChange = y2 - y1;
        double xChange = x2 - x1;
        return roundedToHundredth((yChange/xChange));
    }
    public String equation() {
        if (slope() == 1) {
            if (yIntercept() < 0) {
                return "y = x + " + yIntercept();
            }
            if (yIntercept() == 0) {
                return "y = x";
            }
            return "y = x + " + yIntercept();
        } else if ( slope() == -1) {
            if (yIntercept() < 0) {
                return "y = x + " + yIntercept();
            }
            if (yIntercept() == 0) {
                return "y = x";
            }
            return "y = -x + " + (yIntercept());
        } else {
            if (y2 == y1) {

                return "y = " + yIntercept();
            }
            if ((int) slope() == slope()) {
                if (yIntercept() < 0) {
                    return "y = " + slope() + "x - " + ((yIntercept()));
                }
                if (yIntercept() == 0) {
                    return "y = " + slope() + "x";
                }
                if (yIntercept() > 0) {
                    return "y = " + slope() + "x" + " + " + yIntercept();
                } else {
                    return "y = " + slope() + "x" + " - " + Math.abs(yIntercept());
                }

            } else {
                if (y2 - y1 < 0 && x2 - x1 < 0) {
                    if (yIntercept() < 0) {
                        return "y = " + Math.abs((y2 - y1)) + "/" + Math.abs((x2 - x1)) + "x - " + Math.abs(yIntercept());
                    }
                    if (yIntercept() == 0) {
                        return "y = " + Math.abs((y2 - y1)) + "/" + Math.abs((x2 - x1)) + "x" ;
                    }
                    return "y = " + Math.abs((y2 - y1)) + "/" + Math.abs((x2 - x1)) + "x " + yIntercept();
                } else if (slope() < 0) {
                    if (yIntercept() == 0) {
                        return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x";
                    }
                    if (yIntercept() < 0) {
                        return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x - " + Math.abs((yIntercept()));
                    }
                    return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x" + " + " + (yIntercept());
                } else {
                    if (yIntercept() < 0) {
                        return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x - " + Math.abs((yIntercept()));
                    }
                    if (yIntercept() == 0) {
                        return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x";
                    }
                    return "y = " + (y2 - y1) + "/" + Math.abs((x2 - x1)) + "x" + " + " + (yIntercept());
                }
            }
        }
    }
    public String coordinateForX(double x) {
        return "The point on the line is (" + x + "," + ((slope() * x) + yIntercept()) + ")";
    }
    public String lineInfo() {
        if (x2 != x1) {
            String str = "The 2 points are: " + "(" + x1 + "," + y1 + ")" + " and " + "(" + x2 + "," + y2 + ")\n";
            str += "The equation of the line between these points is: " + equation() + "\n";
            str += "The slope of the line is: " + slope() + "\n";
            str += "The y-int of the line is: " + yIntercept() + "\n";
            str += "The distance between these two lines is " + distance();
            return str;
        } else {
            String str = "These points are on a vertical line: x = " + x1;
            return str;
        }
    }
}
