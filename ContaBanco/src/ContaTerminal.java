import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o nome do cliente:");
        nomeCliente = scanner.nextLine();
        System.out.println("Digite o número da conta:");
        numero = scanner.nextInt();
        System.out.println("Digite o nome da agência:");
        agencia = scanner.next();
        System.out.println("Digite o saldo da conta:");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta número " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");
        System.out.println("Acesse o site para mais informações: www.bytebank.com.br");

        scanner.close();
    }
}
