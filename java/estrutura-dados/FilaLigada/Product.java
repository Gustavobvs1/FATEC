public class Product {
    private int code;
    private String name;
    private int stock;

    public Product(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void updateStock(int value) {
        if (stock + value < 0)
            stock = 0;
        else
            stock += value;
    }

    @Override
    public String toString() {
        return "code=" + code + ", name=" + name + ", stock=" + stock;
    }

}