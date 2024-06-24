import java.awt.*;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Drawable h = new Hero();
        h.draw();

        Triangle t1 = new Triangle(
                new Point(3,2),
                new Point(1,3),
                new Point(1,1)
        );
        t1.draw();
        System.out
    }
}