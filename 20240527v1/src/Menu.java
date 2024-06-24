public class Menu {
    private int id;
    private String name;
    private int price;
    private static int stock;
    Menu(int id,String name,int price,int stock){
        this.id = id;
        this.name = name;
        this.price = price;
        stock--;
    }
}
