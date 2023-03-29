import java.util.Scanner;
import java.util.Arrays;

public class TP02EX02
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = new int [10];
        int soma = 0;
        int maior = 0;
        int menor = 0;
        for (int i = 0; i < 10; ++i) {
            System.out.println("Digite o " + (i + 1) + " valor: ");
            numArr[i] = Integer.parseInt(scanner.next());
            soma += numArr[i];
            if (i == 0) {
                maior = numArr[i];
                menor = numArr[i];
            }
            if (maior < numArr[i]) maior = numArr[i];
            if (menor > numArr[i]) menor = numArr[i];
        }
        System.out.println("O menor valor é: " + menor);
        System.out.println("O maior valor é: " + maior);
        System.out.println("A soma é: " + String.valueOf(soma));
    }
}
