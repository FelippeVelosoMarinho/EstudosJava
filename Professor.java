import java.util.Date;

public class Professor extends Pessoa{
    public String matricula;

    public Professor(String matricula, String nome, String cpf, Date data){
        super(nome, cpf, data);
        this.matricula = matricula;
    }
}
