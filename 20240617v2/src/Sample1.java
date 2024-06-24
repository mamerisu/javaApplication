import java.util.function.Function;

public class Sample1 {

    Function<Integer,Integer> f = x -> x % 2;
    System.out.println("5divide" + f.apply(5));
}
