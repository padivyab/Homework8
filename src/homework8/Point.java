package homework8;

public class Point {

    int x;
    int y;

    public Point()
    {

    }
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    public double distance()
    {
        double d=Math.sqrt((x*this.getX())+(y*this.getY()));
        return d;
    }
    public double distance(int x, int y)
    {
        double a= Math.sqrt((x-this.getX())*(x-this.getX())+(y-this.getY())*(y-this.getY()));
        return a;
    }
    public double distance(Point second)
    {
        double s = Math.sqrt(y * y);
        return s;
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
