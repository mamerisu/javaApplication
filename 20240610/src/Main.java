//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Pair<String> p = new Pair<>("test1","test2");
        System.out.println(p);
        
        Pair2<String,Integer> s = new Pair2<>("test1",100);

        System.out.println(s);

        Pair<String> p1 = new Pair<>("test1","test2");
        Pair<String> p2 = new Pair<>("test3","test4");
        Pair<Pair<String>> pp = new Pair<>(p1,p2);
        quad q = quad.getQuadrupleBy(pp);
        System.out.println(q);
    }
}