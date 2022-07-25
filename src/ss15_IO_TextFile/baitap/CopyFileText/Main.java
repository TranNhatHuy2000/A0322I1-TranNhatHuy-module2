package ss15_IO_TextFile.baitap.CopyFileText;

public class Main {
    public static final String SOURCE_PATH="D:\\codegym\\module2\\src\\ss15_IO_TextFile\\baitap\\CopyFileText\\source";
    public static final String TARGET_PATH="D:\\codegym\\module2\\src\\ss15_IO_TextFile\\baitap\\CopyFileText\\target";

    public static void main(String[] args) {
        CopyFileTxt copyFileTxt = new CopyFileTxt();
        copyFileTxt.copyFileTxt(SOURCE_PATH,TARGET_PATH);
    }
}
