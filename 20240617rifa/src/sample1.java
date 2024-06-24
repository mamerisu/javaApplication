import java.util.List;

public class sample1 {
    public static void main(String[] args) {
        int sum[] = new int[3];

        List<Integer> list1 = List.of(3, 2, 1);
        //合計を計算
        sum[0] = listsum(list1);

        List<Integer> list2 = List.of(3, 2, 11);
        sum[1] = listsum(list2);

        List<Integer> list3 = List.of(3, 21, 11);
        sum[2] = listsum(list3);

        for(Integer e :sum){
            System.out.println(e);
        }

    }
    public static int listsum(List<Integer> list){
        int sum = 0;
        for(Integer e : list){
            sum += e;
        }
        return sum;
    }
}