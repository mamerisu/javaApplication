import java.util.List;

public class Order {
    private int id;
    private List<Pair> menuids;
    private int tabaleid;

    Order(int id, List menuids) {
        this.id = id;
        this.menuids = menuids;
    }

    public int gettotal() {
        int sum = 0;
        for(Pair pair:menuids){
            sum += pair.getOrdernum();
        }
    return sum;
    }

    @Override
    public String toString(){
        String str = "";
        str = str + "伝票番号" + this.id + "/n";
        str = str + "卓番" + this.tabaleid + "/n";
        str = str + "合計金額" + this.gettotal() + "/n";


        return str;
    }

}