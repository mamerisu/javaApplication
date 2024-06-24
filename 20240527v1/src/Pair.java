public class Pair {
    private int menuid;
    private int ordernum;

    Pair(int menuid,int ordernum){
        this.menuid = menuid;
        this.ordernum = ordernum;
    }
    public int getMenuid(){
        return menuid;
    }
    public int getOrdernum(){
        return ordernum;
    }
}