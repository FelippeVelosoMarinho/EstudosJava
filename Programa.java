import java.util.Scanner;

public class Programa {
    public static void main(String[]args){
        int valor;
        String titular;
        int nconta = 3;
        Conta conta = new Conta();

        System.out.println("Digite o numero de seu conta:  ");
        Scanner ler = new Scanner(System.in);
        nconta = ler.nextInt();
        if(nconta == 3){
            System.out.println("Digite o número da operação que você deseja realizar:  ");
            System.out.println("1 - Saque");
            System.out.println("2 - Depósito");
            Scanner l = new Scanner(System.in);
            valor = l.nextInt();

            switch (valor) {
                case 1:
                    conta.saca(5);
                    break;
                case 2:
                    conta.deposito(5);
                    break;
                default:
                    System.out.println("Operação desconhecida");
            }
        }else{
           System.out.println("Recusado!!!");
        }
    }
}
