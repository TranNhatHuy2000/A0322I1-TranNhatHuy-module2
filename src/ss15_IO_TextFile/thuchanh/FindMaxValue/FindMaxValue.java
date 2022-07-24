package ss15_IO_TextFile.thuchanh.FindMaxValue;

import java.util.List;

public class FindMaxValue {
    public static final String number_path="D:\\codegym\\module2\\src\\ss15_IO_TextFile\\thuchanh\\FindMaxValue\\numbers.txt";
    public static final String result_path="D:\\codegym\\module2\\src\\ss15_IO_TextFile\\thuchanh\\FindMaxValue\\result.txt";
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile(number_path);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(result_path, maxValue);
    }
}
