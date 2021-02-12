import java.util.Date;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        int valor;
        int count = 0;

        //Coloquei um While só pra repetir os 3 casos.
        while(count <3){
            count++;

            System.out.println("Digite o número relativo aos dados que você quer consultar:  ");
            System.out.println("1 - Alunos");
            System.out.println("2 - Professores");
            System.out.println("3 - Funcionários");
            Scanner l = new Scanner(System.in);
            valor = l.nextInt();

            //Switch para consultar cada caso separadamente
            switch (valor) {
                case 1:
                    Aluno aluno = new Aluno("Matemática", "Fulano", "09166677667", new Date() );
                    System.out.println("==================================\nOs dados do aluno serão citados abaixo\n\nNome: "+ aluno.nome +"\nCPF: "+ aluno.cpf + "\nDisciplina: "+ aluno.disciplina+"\nData: "+ aluno.data.toString()+"\n\n\n");
                    break;
                case 2:
                    Professor professor = new Professor("5", "Cicrano", "99988877766", new Date() );
                    System.out.println("==================================\nOs dados do professor serão citados abaixo \n\nNome: " + professor.nome + "\nCPF: "+ professor.cpf +"\nMatrícula: "+ professor.matricula + "\nData: "+professor.data.toString()+"\n\n\n");
                    break;
                case 3:
                    Funcionario funcionario = new Funcionario("Chefão", 5000,"Beltrano", "99984877766", new Date() );
                    System.out.println("==================================\nOs dados do funcionário serão citados abaixo \n\nNome: " + funcionario.nome + "\nCPF: "+ funcionario.cpf +"\nCargo: "+ funcionario.cargo + "\nData: "+funcionario.data.toString()+"\n\n\n");
                    break;
                default:
                    System.out.println("Operação desconhecida");
            }
        }
    }
}