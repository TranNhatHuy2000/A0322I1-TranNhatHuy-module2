package ss11_Collection_Framework.baitap;

import java.util.Comparator;

public class SortDesc implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice() -o1.getPrice());
    }
}
