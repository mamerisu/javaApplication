import javax.swing.*;
import java.awt.*;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Drawable h = new Hero();
        //h.draw();

        Triangle t1 = new Triangle(
                new Point(300,200),
                new Point(100,300),
                new Point(100,100)
        );

        Rectangle r1 = new Rectangle(
                new Point(100, 100),
                new Point(200, 100),
                new Point(200, 200),
                new Point(100, 200)
        );
        System.out.println(t1.getArea());
        JFrame frame = new JFrame();
        frame.setSize(400,600);
        //frame.add(new MyPanel(t1));
        frame.add(new MyPanel(r1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
class MyPanel extends JPanel{
    private Drawable drawable;
    MyPanel(Drawable drawable){
        this.drawable = drawable;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        drawable.draw(g);
    }
}