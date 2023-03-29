import java.util.Scanner;
import java.util.Arrays;

public class TP02EX03
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros: ");
        double length = Double.parseDouble(scanner.next());
        
        int[] numArr = new int [(int)length];
        int soma = 0;
        int maior = 0;
        int menor = 0;
        int numPositive = 0;
        int numNegative = 0;
        
        for (int i = 0; i < length; ++i) {
            System.out.println("Digite o " + (i + 1) + " valor: ");
            numArr[i] = Integer.parseInt(scanner.next());
            soma += numArr[i];
            if (i == 0) {
                maior = numArr[i];
                menor = numArr[i];
            }
            if (maior < numArr[i]) maior = numArr[i];
            if (menor > numArr[i]) menor = numArr[i];
            if (numArr[i] > 0) ++numPositive;
            if (numArr[i] < 0) ++numNegative;
        }
        System.out.println("O menor valor é: " + menor);
        System.out.println("O maior valor é: " + maior);
        System.out.println("A soma é: " + String.valueOf(soma));
        System.out.println("A média aritmética dos valores é: " + String.valueOf((soma / length)));
        System.out.println("A porcentagem de valores negativos é: " + String.valueOf((numNegative / length * 100)) + "%");
        System.out.println("A porcentagem de valores positivos é: " + String.valueOf((numPositive / length * 100)) + "%");
    }
}
