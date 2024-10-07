
import java.util.Locale;

public class CaixaEletronico {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double saldo = 25.0;
        double valorSolicitado = 22.00;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
            System.out.printf("Novo saldo: R$ %.2f%n", saldo);
        }else{
            System.out.println("Saldo insuficiente!");
        }
            
        
    }
}
