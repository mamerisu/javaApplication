import java.awt.*;

public class Rectangle extends Shape implements Drawable{
    Point p1;
    Point p2;
    Point p3;
    Point p4;
    Rectangle(Point p1,Point p2,Point p3,Point p4){
        this.size = 1;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    @Override
    public void draw(Graphics g){
        int[] xPoints = {p1.x,p2.x,p3.x,p4.x};
        int[] yPoints = {p1.y,p2.y,p3.y,p4.y};

        g.drawPolygon(xPoints,yPoints, 4);

    }
}
