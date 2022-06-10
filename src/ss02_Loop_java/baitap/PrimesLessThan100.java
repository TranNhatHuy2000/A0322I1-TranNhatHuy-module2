package ss02_Loop_java.baitap;

public class PrimesLessThan100 {
    public static void main(String[] args) {
        int number =100, N=2;
        boolean check = true;
        System.out.print("Các số nguyên tố <100 là: ");
        for (int i = 1; i <= number;i++){
            for (int j = 2 ;j <= Math.sqrt(N) ;j++) {
                if (N%j==0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                i++;
                System.out.println(N);
            }
            check = true;
            N++;
        }
    }
}
