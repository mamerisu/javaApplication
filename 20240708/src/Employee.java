public class Employee {
    public static final int ENGINEER = 0;
    public static final int MANAGER = 1;
    public static final int INTERN = 2;

    private String name;
    private int type;

    public Employee(String name,int type){
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return name;
    }
    public int getType(){
        return type;
    }
}
