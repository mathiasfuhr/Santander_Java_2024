public class ForArray {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Vitoria", "Lucas", "João"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
        
            System.out.println("---------------");

        for (String aluno : alunos) {
            System.out.println("O aluno é " + aluno);
        }

    }
}
