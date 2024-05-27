import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
        try (Scanner scanner1 = new Scanner(System.in)) {

        System.out.println("Por favor, insira o número da sua agência.");
        String numeroAgencia = scanner.next();

        int numeroConta = 0;
        while (true) {
            System.out.println("Insira o número de sua conta.");
            try {
                numeroConta = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada Inválida. Por favor,insira um número inteiro para a conta.");
                scanner.next();
            }
        }

        System.out.println("Insira o seu nome.");
        String nome = scanner1.nextLine();

        System.out.println("Insire o seu saldo.");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque!");
            }
        }
    }
}
