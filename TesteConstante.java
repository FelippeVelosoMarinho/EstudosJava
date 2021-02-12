import java.util.Scanner;

public class TesteConstante {
    public static void main(String[] args) {
        Constante constante = new Constante();
        int opcao;

        Scanner ler = new Scanner(System.in);
        System.out.println("Em qual forma você deseja a resolução do exercício? \n1 - If\n2 - For");
        opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                constante.metIfMaior();
                constante.metIfMenor();
                break;
            case 2:
                constante.metFor();
                break;
            default:
                System.out.println("Opção desconhecida");
        }

    }
}
