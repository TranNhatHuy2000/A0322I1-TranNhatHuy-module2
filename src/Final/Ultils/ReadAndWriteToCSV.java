package Final.Ultils;

import Final.Models.InProduct;
import Final.Models.OutProduct;
import Final.Models.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteToCSV {
    public static ArrayList<Product> writeInProductToCSV(ArrayList<Product> products) {
        File file = new File("D:\\codegym\\module2\\src\\Final\\data\\product.csv");
        try {
            FileWriter fileWriter = new FileWriter(file, false);// append: true // cho phép ghi tiếp/ false nghi đề
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Product product : products) {
                if (product instanceof InProduct) {
                    bufferedWriter.write("NK," + product.getInfoCSV());
                    bufferedWriter.newLine();
                } else {
                    bufferedWriter.write("XK," + product.getInfoCSV());
                    bufferedWriter.newLine();
                }

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
        }
        return products;
    }

    public static ArrayList<Product> readProductListFromCSV() {
        ArrayList<Product> productArrayList = new ArrayList<>();
            try {
                File file = new File("D:\\codegym\\module2\\src\\Final\\data\\product.csv");
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line ;
                String temp[] ;
                Product product;
                while ((line = bufferedReader.readLine()) != null) {
                    temp = line.split(",");
                    if (temp[0].trim().equals("NK")) {
                        product = new InProduct(temp[1], Double.parseDouble(temp[2]), Integer.parseInt(temp[3]), temp[4], Double.parseDouble(temp[5]), temp[6], Double.parseDouble(temp[7])) {
                        };
                    } else {
                        product = new OutProduct(temp[1], Double.parseDouble(temp[2]), Integer.parseInt(temp[3]), temp[4], Double.parseDouble(temp[5]), temp[6]) {
                        };
                    }
                    productArrayList.add(product);
                }
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
            }

        return productArrayList;
    }
}




