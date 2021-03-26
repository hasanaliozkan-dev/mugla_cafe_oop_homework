public abstract class Beverage {


    public static final int SMALL =0;
    public static final int MEDIUM =1;
    public static final int LARGE =2;
    int size;
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String sizeName() {
        if(this.size == SMALL)
            return  "Small";
        if(this.size == MEDIUM)
            return  "Medium";
        return"Large";

    };

    public abstract int cost();
    public abstract String withMilkorWithLemon();
}
