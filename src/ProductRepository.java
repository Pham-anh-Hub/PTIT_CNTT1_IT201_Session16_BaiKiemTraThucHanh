import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductRepository implements IRepository<Product>{
    public ArrayList<Product> products;
    public HashMap<String, Product> productMap;

    public ProductRepository() {
        this.products = new ArrayList<>();
        this.productMap = new HashMap<>();
    }

    @Override
    public boolean add(Product item) {
        return products.add(item);
    }

    @Override
    public boolean removeById(String id) {
        return products.remove(productMap.get(id));
    }

    @Override
    public Product findById(String id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> findAll() {
        return products;
    }
}
