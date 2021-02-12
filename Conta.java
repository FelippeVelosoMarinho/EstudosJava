public class Conta {
    float saldo = 10;

    public void saca(double valorDoSaque) {

        if(valorDoSaque>saldo){
            System.out.println("Você não tem saldo suficiente.");
        }else{
            double saldos = saldo - valorDoSaque;
            System.out.println("Seu saldo atual é " + saldos);
        }
    }

    public double deposito(double valorDoDeposito) {
        double saldod = saldo + valorDoDeposito;
        System.out.println("Seu saldo atual é " + saldod);
        return saldod;
    }
}
