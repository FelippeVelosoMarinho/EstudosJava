import java.util.Date;

public class Aluno extends Pessoa{
    public String disciplina;

    public Aluno(String disciplina, String nome, String cpf, Date data){
        super(nome, cpf, data);
        this.disciplina = disciplina;
    }
}
