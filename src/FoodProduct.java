public class FoodProduct extends Product{
    private int discountPercent;

    public FoodProduct(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    double calculateFinalPrice() {
        return this.getPrice() - (this.getPrice() * discountPercent / 100);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println(" | Chiết khấu: " + this.discountPercent + "%");
    }
}
