package ss16_IO_BinaryFile.baitap.QLSP;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementImpl {
    public static final String FILE_PATH ="D:\\codegym\\module2\\src\\ss16_IO_BinaryFile\\baitap\\QLSP\\productfile";
    public static List<Product> readData (String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = null;
        List<Product> productList = null;

            fileInputStream = new FileInputStream(path);
            ObjectInput objectInput = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInput.readObject();
            return productList;

    }

    public static void writeData(List<Product> productList,String path) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutput objectOutput = new ObjectOutputStream(fileOutputStream);
        objectOutput.writeObject(productList);
        objectOutput.close();

    }

    public static void display(List<Product> productList) {
        for (Product product:productList
        ) {
            System.out.println(product);
        }
    }

    public static void addProduct(List<Product> productList){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input code Product: ");
            int code = Integer.parseInt(scanner.nextLine());
            System.out.print("Input name Product: ");
            String name = scanner.nextLine();
            System.out.print("Input manufacturer: ");
            String manufacturer = scanner.nextLine();
            System.out.print("Input price: ");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.print("Input descriptions: ");
            String descriptions = scanner.nextLine();
            productList.add(new Product(code, name, manufacturer,price,descriptions));
            System.out.println("add success!");
        }catch (Exception e){
            System.out.println(e.getMessage());;
        }

    }

    public static void searchProduct(List<Product> productList){
        System.out.println("Enter name product: ");
        Scanner scanner = new Scanner(System.in);
        String nameSearch = scanner.nextLine().trim();
        boolean checkNull = false;
        for (Product product : productList){
            if(nameSearch.equals(product.getNameProduct())){
                checkNull = true;
                System.out.println(product);
            }
        }
        if(!checkNull){
            System.out.println("Not product Found!");
        }
    }
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"fan" ,"samsung",43234,"Ádsad"));
        try {
            productList = readData(FILE_PATH);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        int choose = -1;
        do{
            System.out.println("Enter number: ");
            System.out.println("1. Display Products");
            System.out.println("2. Add Product");
            System.out.println("3. Search");
            System.out.println("4. End");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    display(productList);
                    break;
                case 2:
                    addProduct(productList);
                    try {
                        writeData(productList,FILE_PATH);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    searchProduct(productList);
                    break;
            }
        }while (choose != 4);
    }
}
