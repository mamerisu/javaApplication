import java.util.HashSet;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Fruits f = new Fruits(100,"Canada","赤");
        Apple apple = new Apple(100,"Japan","赤");
        System.out.println(apple.price);
        System.out.println(apple.madeIn);

        System.out.println(apple.getDetail());
        System.out.println(apple.isMadeInJapan());
        System.out.println(apple.toString());


        Fruits f1 = new Fruits(100,"Canada","赤");
        Fruits f2 = new Fruits(100,"Canada","赤");
        HashSet<Fruits> hf1 = new HashSet<>();
        hf1.add(f1);
        HashSet<Fruits> hf2 = new HashSet<>();
        hf2.add(f2);
        System.out.println(hf1.equals(hf2));
    }
}