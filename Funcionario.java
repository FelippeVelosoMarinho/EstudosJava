import java.util.Date;

public class Funcionario extends Pessoa{
    public float salario;
    public String cargo;

    public Funcionario(String cargo, float salario, String nome, String cpf, Date data){
        super(nome, cpf, data);
        this.cargo = cargo;
        this.salario = salario;
    }
}

