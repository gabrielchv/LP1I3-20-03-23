import java.util.Scanner;
import java.util.Arrays;

public class TP02EX09
{   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de colunas da array: ");
        int M = Integer.parseInt(scanner.next());
        System.out.println("Digite a quantidade de linhas da array: ");
        int N = Integer.parseInt(scanner.next());
        final int col = M > 10 ? 10 : M;
        final int lin = N > 10 ? 10 : N;
        int k = 1;
        int[][] numArr = new int [col][lin];
        int[][] transpNumArr = new int [lin][col];
        for (int i = 0; i < col; ++i) {
            for (int j = 0; j < lin; ++j, ++k) {
                System.out.println("Digite o " + k + " valor: ");
                numArr[i][j] = Integer.parseInt(scanner.next());
            }
        }
        // Show transposta array
        System.out.println("Array transposta:");
        for (int i = 0; i < col; ++i) {
            for (int j = 0; j < lin; ++j) {
                transpNumArr[j][i] = numArr[i][j];
                System.out.print("|" + transpNumArr[j][i] + "|");
            }
            System.out.println("");
        }
    }
}
