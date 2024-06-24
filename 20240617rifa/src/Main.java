import java.util.List;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(3, 2, 1);
        //合計を計算
        int sum1 = 0;
        for (Integer e : list1) {
            sum1 += e;
        }

        List<Integer> list2 = List.of(3, 2, 11);
        int sum2 = 0;
        sum2 = listsum(list2);

        List<Integer> list3 = List.of(3, 21, 11);
        int sum3 = 0;
        sum3 = listsum(list3);


        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);


    }
    public static int listsum(List<Integer> list){
        int sum = 0;
        for(Integer e : list){
            sum += e;
        }
        return sum;
    }
}