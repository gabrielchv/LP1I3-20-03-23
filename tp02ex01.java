import java.util.Scanner;

public class TP02EX01
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int num1 = Integer.parseInt(scanner.next());
        System.out.println("Digite um valor maior que o primeiro: ");
        int num2 = Integer.parseInt(scanner.next());
        
        while (num1 >= num2) {
            System.out.println("Digite novamente o segundo valor, maior que o primeiro: ");
            num2 = Integer.parseInt(scanner.next());
        }
        
        System.out.println("Pronto, " + String.valueOf(num1) + " é maior que " + String.valueOf(num2));
    }
}
