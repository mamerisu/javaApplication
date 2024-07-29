import java.awt.*;


public class Triangle extends Shape implements Drawable,Measurable{
    Point p1;
    Point p2;
    Point p3;

    Triangle(Point p1,Point p2,Point p3){
        this.size = 1;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    @Override
    public void draw(Graphics g){
        int[] xPoints = {p1.x,p2.x,p3.x};
        int[] yPoints = {p1.y,p2.y,p3.y};

        g.drawPolygon(xPoints,yPoints, 3);

       System.out.println("三角を描きました");
    }
    @Override
    public double getArea(){
        double a = this.p1.distance(this.p2);
        double b = this.p2.distance(this.p3);
        double c = this.p3.distance(this.p1);
        return applyHeronFormula(a,b,c);
    }

    public double applyHeronFormula(double a, double b, double c){
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    public int getPerimeter(){
        return 0;
    }
}
