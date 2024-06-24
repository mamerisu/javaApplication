import java.awt.*;
import java.util.Date;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("mame",22);
        Person p2 = new Person("mame2",23);
        Person p3 = new Person("mame3",24);
        System.out.println(p2.getAge());
        System.out.println(Person.getNumber());


        Point p = new Point(6,4);
        int x = p.x;
        int y = p.y;
        System.out.println(x);

        String s = String.valueOf("おはよう");
        System.out.println(s);

        int t = Integer.parseInt("123");
        System.out.println(t + 3);//文字型が数字型

        Date d = new Date();
        System.out.println(d.getTime());
        
    }
}