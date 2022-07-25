package ss15_IO_TextFile.baitap.ReadFileCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    public static final String COUNTRY_PATH_CSV="D:\\codegym\\module2\\src\\ss15_IO_TextFile\\baitap\\ReadFileCSV\\CountryCSV.csv";
    public List<Country> readCSV(String path){
        List<Country> countriesList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Country country;
            while ((line = bufferedReader.readLine())!= null){
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]) ;
                String code = temp[1];
                String name = temp[2];

                country = new Country(id,code,name);
                countriesList.add(country);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return countriesList;
    }

    public static void main(String[] args) {
        ReadCSV readCSV  = new ReadCSV();
        List<Country> countries = readCSV.readCSV(COUNTRY_PATH_CSV);
        for (Country country: countries
             ) {
            System.out.println(country);
        }

    }
}
