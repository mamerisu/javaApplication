public class quad <T>{
    private T first;
    private T second;
    private T third;
    private T fourth;

    quad(T first,T second,T third,T fourth){
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public static <T> quad<T> getQuadrupleBy(Pair<Pair<T>> pairPair){
        return new quad<T>(
                pairPair.first.first,
                pairPair.first.second,
                pairPair.second.first,
                pairPair.second.second
        );
    }

    @Override
    public String toString(){
        return "(" + this.first + "," +
                this.second + "," +
                this.third + "," +
                this.fourth + ")";
    }
}
