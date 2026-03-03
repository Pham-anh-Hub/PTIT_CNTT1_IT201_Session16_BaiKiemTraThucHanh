public class ElectronicProduct extends Product{
    private int warrantyMonths;

    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    double calculateFinalPrice() {
        if(this.warrantyMonths > 12){
            return this.getPrice() + 1000000;
        }
        return this.getPrice();
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println(" | Bảo hành: " + this.warrantyMonths + " tháng");
    }
}
