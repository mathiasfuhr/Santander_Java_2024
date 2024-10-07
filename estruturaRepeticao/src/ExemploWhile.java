import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom; // valor Aleatorio

public class ExemploWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double mesada = 50.00;

        System.out.println("Mesada inicial: " + mesada);
        System.out.println("-------------------------");
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho.");
            mesada = mesada - valorDoce;
            
            System.out.println("-------------------------");
            System.out.println("Mesada restante: " + mesada);
        }
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
