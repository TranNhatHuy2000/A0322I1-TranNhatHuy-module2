package ss11_Collection_Framework.baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProductManageLinkedList {
    List<Product> productsList = new LinkedList<>();

    public void displayProducts(){
        for(Product product: productsList){
            System.out.println(product.toString());
        }
    }

    public void addProduct(Product product){
        productsList.add(product);
    }

    public void delProduct(int id){
        int index = -1;
        for (Product product:productsList){
            index++;
            if (product.getIdProduct() == id){
                productsList.remove(index);
                break;
            }
        }

    }

    public void editProduct(int id, Product product) {
        for (int i=0; i<productsList.size(); i++)
        {
            if (id==productsList.get(i).getIdProduct())
            {
                id=i;
                break;
            }
        }
        productsList.set(id,product);
    }


    public void searchProduct(String name) {
        Product productSearch = null;
        for (Product product: productsList)
        {
            if(product.getNameProduct().equals(name))
            {
                productSearch = product;
                System.out.println(productSearch.toString());
            }
        }
        if (productSearch == null){
            System.out.println("not found");
        }
    }

    public void sortAsc(){
        SortAsc sortAsc = new SortAsc();
        Collections.sort(productsList,sortAsc);
    }

    public void sortDecs(){
        SortDesc sortDesc = new SortDesc();
        Collections.sort(productsList,sortDesc);
    }

    public static void main(String[] args) {
        ProductManageLinkedList productManageLinkedList = new ProductManageLinkedList();
        productManageLinkedList.addProduct(new Product(1,"keyboard",10.2));
        productManageLinkedList.addProduct(new Product(2,"mouse",4));
        productManageLinkedList.addProduct(new Product(3,"led",50));
        productManageLinkedList.addProduct(new Product(4,"bottle",2));

        productManageLinkedList.editProduct(2,new Product(5,"abc",7));

        productManageLinkedList.sortAsc();

        productManageLinkedList.displayProducts();

        productManageLinkedList.sortDecs();

        productManageLinkedList.displayProducts();

        productManageLinkedList.searchProduct("tv");

    }
}
