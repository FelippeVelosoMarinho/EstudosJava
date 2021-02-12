import java.util.Date;

public class Pessoa {
    public String nome;
    public String cpf;
    public Date data = new Date ();

    /* construtor com os parâmetros */
    public Pessoa(String nome, String cpf, Date data){
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
    }
}
