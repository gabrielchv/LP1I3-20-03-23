import java.util.Scanner;
import java.util.Arrays;

public class TP02EX04
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int col = 2;
        final int lin = 3;
        int k = 1;
        int[][] numArr = new int [col][lin];
        for (int i = 0; i < col; ++i) {
            for (int j = 0; j < lin; ++j, ++k) {
                System.out.println("Digite o " + k + " valor: ");
                numArr[i][j] = Integer.parseInt(scanner.next());
            }
        }
        k = 1;
        for (int i = 0; i < col; ++i) {
            for (int j = 0; j < lin; ++j, ++k) {
                System.out.println("O " + k + " valor é: " + numArr[i][j]);
            }
        }
    }
}
