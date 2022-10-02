public class Item {

    private final String code;
    private final int price;

    public Item(String code, int cost){
        this.code = code;
        this.price = cost;
    }

    public String getCode() {
        return code;
    }

    public int getPrice() {
        return price;
    }

}