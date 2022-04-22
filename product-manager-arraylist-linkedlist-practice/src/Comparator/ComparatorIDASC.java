package Comparator;

import java.util.Comparator;
import model.Product;

public class ComparatorIDASC implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Long.compare(o1.getId(), o2.getId());
    }
}
