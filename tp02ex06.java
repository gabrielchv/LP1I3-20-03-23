import java.util.Scanner;
import java.util.Arrays;

public class TP02EX06
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int col = 2;
        final int lin = 3;
        int k = 1;
        String[][] numArr = new String [col][lin];
        for (int i = 0; i < col; ++i) {
            for (int j = 0; j < lin; ++j, ++k) {
                System.out.println("Digite a " + k + " palavra: ");
                numArr[i][j] = scanner.next();
            }
        }
        k = 1;
        for (int i = 0; i < col; ++i) {
            for (int j = 0; j < lin; ++j, ++k) {
                System.out.println("A " + k + " palavra é: " + numArr[i][j]);
            }
        }
    }
}
