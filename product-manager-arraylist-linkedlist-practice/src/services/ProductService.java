package services;

import model.Product;
import comparator.*;
import views.Menu;
import views.ProductView;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductService implements IProductService {
    static Scanner input = new Scanner(System.in);
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
        Product result = null;
        for (Product product : getProducts()) {
            if (product.getId() == id) {
                result = product;
                break;
            }
        }
        return result;
    }

    @Override
    public boolean existById(long id) {
        return getById(id) != null;
    }

    @Override
    public void update(Product newProduct) {
        Product product = getById(newProduct.getId());
        product.setName(newProduct.getName());
        product.setPrice(newProduct.getPrice());
        product.setQuantity(newProduct.getQuantity());
    }

    @Override
    public void removeById(long id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.remove(i);
                break;
            }
        }
    }

    public void sortByIDASC() {
        productList.sort(new ComparatorIDASC());
    }

    public void sortByIDDESC() {
        productList.sort(new ComparatorIDDESC());
    }

    public void sortByNameASC() {
        productList.sort(new ComparatorNameASC());
    }

    public void sortByNameDESC() {
        productList.sort(new ComparatorNameDESC());
    }

    public void sortByQuantityASC() {
        productList.sort(new ComparatorQuantityASC());
    }

    public void sortByQuantityDESC() {
        productList.sort(new ComparatorQuantityDESC());
    }

    public void sortByPriceASC() {
        productList.sort(new ComparatorPriceASC());
    }

    public void sortByPriceDESC() {
        productList.sort(new ComparatorPriceDESC());
    }
}
