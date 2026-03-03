import java.text.NumberFormat;

public class Product {
    private String id;
    private String name; // Tên sản phẩm
    private double price; // Giá sản phẩm


    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    double calculateFinalPrice(){
        return this.price;
    }

    void displayInfo(){
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.print("\n" + this.id + " - " + this.name + " - Giá gốc: " + nf.format(this.price) + " VND");
    }

}
