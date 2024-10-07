
public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 5;

       String resultado = nota >=7 ? "aprovado" : nota >5 && nota <7 ? "recuperacao" : "reprovado";
       System.out.println("Você está " + resultado + "!");
    }
}
