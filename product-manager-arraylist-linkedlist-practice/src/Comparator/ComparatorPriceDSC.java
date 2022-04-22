package Comparator;

import model.Product;
import java.util.Comparator;

public class ComparatorPriceDSC implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o2.getPrice(), o1.getPrice());
    }
}
