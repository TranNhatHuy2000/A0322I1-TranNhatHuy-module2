package ss15_IO_TextFile.baitap.CopyFileText;

import java.io.*;

public class CopyFileTxt {
    public void copyFileTxt(String sourcePath, String targetPath){
        String line="";
        try {
            File sourceFile = new File(sourcePath);
            File targetFile = new File(targetPath);
            if (!sourceFile.exists() || !targetFile.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(sourceFile);
            FileWriter fileWriter = new FileWriter(targetFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            while ((line = bufferedReader.readLine())!= null){
                bufferedWriter.write(line+"\n");
            }

            bufferedReader.close();
            bufferedWriter.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
