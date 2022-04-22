package services;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getProducts();

    void add(Product newProduct);
    Product getById(long id);

    boolean existById(long id);

    void update(Product newProduct);

    void removeById(long id);
}
