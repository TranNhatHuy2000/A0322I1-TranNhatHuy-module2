package ss11_Collection_Framework.baitap;

import java.util.Comparator;

public class SortAsc implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
