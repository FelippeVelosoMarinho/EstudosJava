import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        float temperatura;//temperatura que vai receber
        int valor;//pra selecionar os casos no switch
        int tipo;//pra selecionar qual tipo de conversão será realizado

        System.out.println("Digite a temperatura: ");
        Scanner l = new Scanner(System.in);
        temperatura = l.nextInt();
        System.out.println("Digite em qual tipo de medida está: ");

        System.out.println("1 - Celsius");
        System.out.println("2 - Fahrenheit");
        System.out.println("3 - Kelvin");
        valor = l.nextInt();

        switch (valor) {
            case 1:
                System.out.println("Digite o nº do tipo de medida você deseja a conversão: ");
                System.out.println("1 - Fahrenheit");
                System.out.println("2 - Kelvin");
                tipo = l.nextInt();
                if(tipo == 1){
                    float cfah = (((9*temperatura)+160)/5);
                    System.out.println( temperatura + "Cº em Fahrenheit é: " + cfah);
                }
                else if(tipo == 2){
                    float ckel = (temperatura + 273);
                    System.out.println( temperatura + "Cº em Kelvins é: " + ckel);
                }
                else if((tipo != 2) && (tipo != 3)){
                    System.out.println("Não existe essa opção!!");
                }
                break;
            case 2:
                System.out.println("Digite o nº do tipo de medida você deseja a conversão: ");
                System.out.println("1 - Celsius");
                System.out.println("2 - Kelvin");
                tipo = l.nextInt();
                if(tipo == 1){
                    float fcel = (temperatura-32)*(5/9);
                    System.out.println( temperatura + "Fº em Celsius é: " + fcel);
                }
                else if(tipo == 2){
                    float fcel = (temperatura-32)*(5/9);
                    float fkel = (fcel + 273);
                    System.out.println( temperatura + "Fº em Kelvins é: " + fkel);
                }
                else if((tipo != 2) && (tipo != 3)){
                    System.out.println("Não existe essa opção!!");
                }
                break;
            case 3:
                System.out.println("Digite o nº do tipo de medida você deseja a conversão: ");
                System.out.println("1 - Celsius");
                System.out.println("2 - Fahrenheit");
                tipo = l.nextInt();
                if(tipo == 1){
                    float kcel = temperatura - 273;
                    System.out.println( temperatura + " Kelvins em Celsius é: " + kcel);
                }
                else if(tipo == 2){
                    float kcel = temperatura - 273;
                    float kcfah = (((9*kcel)+160)/5);
                    System.out.println( temperatura + " Kelvins em Fahrenheit é: " + kcfah);
                }
                else if((tipo != 2) && (tipo != 3)){
                    System.out.println("Não existe essa opção!!");
                }
                break;
            default:
                System.out.println("Operação desconhecida");
        }
    }
}