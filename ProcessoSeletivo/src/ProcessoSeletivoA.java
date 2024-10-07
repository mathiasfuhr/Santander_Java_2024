
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivoA {

    public static void main(String[] args) {
        String[] candidatos = { "Vitor", "Joaquim", "Vitor", "Mathias", "Josiane" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentanto = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentanto = !atendeu;
            if (continuarTentanto) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato Realizado com sucesso para o candidato " + candidato);
            }
        } while (continuarTentanto && tentativasRealizadas < 3);
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "Vitor", "Joaquim", "Vitor", "Mathias", "Josiane" };
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatos[indice]);
            System.out.println("---------------");
        }
        System.out.println("###################");
        System.out.println("Forma abreviada de intereção for each");
        System.out.println("###################");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Vitoria", "Lucas", "Felipe", "João", "Joaquim", "Vitor", "Joaquim", "Vitor",
                "Mathias", "Josiane" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("-----------------");
            System.out.println("O candidato " + candidato + " Solicitou este valor de sálario " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o condidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidados");
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }
}
