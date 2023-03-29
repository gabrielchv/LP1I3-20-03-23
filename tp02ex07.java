import java.util.Scanner;
import java.util.Arrays;

public class TP02EX07
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int col = 3;
        final int lin = 4;
        int k = 1;
        int[][] numArr = new int [col][lin];
        int[][] multNumArr = new int [col][lin];
        for (int i = 0; i < col; ++i) {
            for (int j = 0; j < lin; ++j, ++k) {
                System.out.println("Digite o " + k + " valor: ");
                numArr[i][j] = Integer.parseInt(scanner.next());
            }
        }
        k = 1;
        System.out.println("Digite o multiplicador: ");
        int mult = Integer.parseInt(scanner.next());
        for (int i = 0; i < col; ++i) {
            for (int j = 0; j < lin; ++j, ++k) {
                multNumArr[i][j] = (numArr[i][j] * mult);
                System.out.println("O " + k + " valor multiplicado é: " + multNumArr[i][j]);
            }
        }
    }
}
