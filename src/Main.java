import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductRepository productRepo = new ProductRepository();

//        Thêm ít nhất 4 sản phẩm gồm:
//          2 ElectronicProduct
        productRepo.add(new ElectronicProduct("P001", "Điều hòa Casper", 6500000, 6));
        productRepo.productMap.put("Electronic", (new ElectronicProduct("P001", "Điều hòa Casper", 6500000, 6)));

        productRepo.add(new ElectronicProduct("P002", "Laptop Dell Inspiron 14 5410", 1550000, 10));
        productRepo.productMap.put("Electronic", new ElectronicProduct("P002", "Laptop Dell Inspiron 14 5410", 1550000, 10));

        productRepo.add(new ElectronicProduct("P003", "Chuột không giây kết nối Bluetooth và USB", 158000, 10));
        productRepo.productMap.put("Electronic", new ElectronicProduct("P003", "Chuột không giây kết nối Bluetooth và USB", 158000, 10));
//          2 FoodProduct
        productRepo.add(new FoodProduct("P004", "Bánh mỳ Sài Gòn", 25000, 10));
        productRepo.productMap.put("Food", new FoodProduct("P004", "Bánh mỳ Sài Gòn", 25000, 10));

        productRepo.add(new FoodProduct("P005", "Bánh gấu Thái Lan", 55000, 12));
        productRepo.productMap.put("Food", new FoodProduct("P005", "Bánh gấu Thái Lan", 55000, 12));

        productRepo.add(new FoodProduct("P006", "Bún trộn Thập cẩm", 55000, 0));
        productRepo.productMap.put("Food", new FoodProduct("P006", "Bún trộn Thập cẩm", 55000, 0));


//        Hiển thị toàn bộ danh sách sản phẩm
//        Gọi displayInfo()
//        In thêm "Thành tiền" bằng calculateFinalPrice()
        System.out.println("======= DANH SÁCH SẢN PHẨM =======");
        double total = 0;
        for (Product p : productRepo.products){
                p.displayInfo();
                total+=p.calculateFinalPrice();
        }
        System.out.println("======================================");
        System.out.println("Thành tiền: " + total + " VND");

//        Tìm sản phẩm theo id và hiển thị kết quả
        System.out.println("Nhập ID sản phẩm cần tìm: ");
        String targetID = sc.nextLine();
        if(productRepo.findById(targetID) != null){
            Product target = productRepo.findById(targetID);
            System.out.print("Sản phẩm cần tìm:  ");
            target.displayInfo();
        }else{
            System.out.println("Không thấy sản phẩm cần tìm.");
        }


//        Sắp xếp danh sách theo giá tăng dần (dùng Collections.sort hoặc Comparator)
        ;
//        Thống kê số lượng sản phẩm theo từng loại (Electronic, Food)
        System.out.println("Danh sách Sản phẩm");
        System.out.println("Điện tử");
        for(Product p : productRepo.products){
            if(p instanceof ElectronicProduct){
                p.displayInfo();
            }
        }
        System.out.println("Thực phẩm");
        for(Product p : productRepo.products){
            if(p instanceof FoodProduct){
                p.displayInfo();
            }
        }

//        Trả về kết quả dạng Map<String, Integer>


    }
}