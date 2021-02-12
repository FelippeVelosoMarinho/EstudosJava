import java.util.Scanner;

public class Constante {
    Scanner ler = new Scanner(System.in);
    int n1;
    int n2;
    int n3;

    public static int n = 0;
    public static int maior = 0;
    public static int menor = 0;

    //Resolvendo o problema em If, maiores
    public void metIfMaior(){
        System.out.println("Então você escolheu If...");
        System.out.println("Digite um número: ");
        n1 = ler.nextInt();
        System.out.println("Digite outro número: ");
        n2 = ler.nextInt();
        System.out.println("Digite só mais um número: ");
        n3 = ler.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println("O maior número é: " + n1);
        }
        else if(n2 > n1 && n2 > n3){
            System.out.println("O maior número é: " + n2);
        }
        else if(n3 > n2 && n3 > n1){
            System.out.println("O maior número é: " + n3);
        }
        else if(n1==n3 && n1==n2 && n2==n3 ){
            System.out.println("Não pode dois números iguais!");
        }
    }

    //Resolvendo o problema em If, menores
    public void metIfMenor(){
        if(this.n1 < this.n2 && this.n1 < this.n3){
            System.out.println("O menor número é: " + this.n1);
        }
        else if(this.n2 < this.n1 && this.n2 < this.n3){
            System.out.println("O menor número é: " + this.n2);
        }
        else if(this.n3 < this.n2 && this.n3 < this.n1){
            System.out.println("O menor número é: " + this.n3);
        }
    }

    //Resolvendo o problema em For
    public void metFor(){

        System.out.println("Então você escolheu For...");
        for(int x = 0; x < 3; x++) {
            System.out.println("Digite um número: ");
            n = ler.nextInt();

            if(x == 0){
                maior = n;
                menor = n;
            }
            else if(n > maior){
                maior = n;
            }
            else if(n < menor){
                menor = n;
            }
        }
        System.out.println("O menor número é: " + menor);
        System.out.println("O maior número é: " + maior);
    }
}