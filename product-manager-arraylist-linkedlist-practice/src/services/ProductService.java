package services;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    private final ArrayList<Product> productList = new ArrayList<>();

    public ProductService() {
        productList.add(new Product(11111, "Omo", 50, 1000));
        productList.add(new Product(11112, "H&S", 22, 323200));
        productList.add(new Product(22223, "M&M", 10, 2320));
        productList.add(new Product(33332, "Wew", 3, 450000));
        productList.add(new Product(15000, "Tesla", 88, 9500000));
    }


    @Override
    public List<Product> getProducts() {
        return productList;
    }

    @Override
    public void add(Product newProduct) {
        productList.add(newProduct);
    }

    @Override
    public Product getById(long id) {
        for (Product product : getProducts()) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public boolean existById(long id) {
        return getById(id) != null;
    }

    @Override
    public void update(Product newProduct) {
        Product product = getById(newProduct.getId());
        product.setName(newProduct.getName());

    }

    @Override
    public void removeById(long id) {

    }
}
