import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        // Configura o scanner para usar Locale.US
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Por favor, digite o seu Nome!");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o número da Agência!");
            String agencia = scanner.nextLine();  // Usar nextLine() para ler a linha inteira

            System.out.println("Por favor, digite o número da Conta!");
            int conta = scanner.nextInt();

            // Consumir a nova linha restante após nextInt()
            scanner.nextLine();

            System.out.println("Por favor, digite o seu Saldo!");
            double saldo = scanner.nextDouble();

            // Consumir a nova linha restante após nextDouble()
            scanner.nextLine();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
        } finally {
            // Fecha o scanner
            scanner.close();
        }
    }
}
