package Comparator;

import model.Product;
import java.util.Comparator;

public class ComparatorIDDSC implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Long.compare(o2.getId(), o1.getId());
    }
}
