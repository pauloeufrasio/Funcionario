public abstract class Funcionario {
    private String nome;
    private String cpf;
    // Alterando Atributo para privado por boa pratica e retirando o protected da Classe e acessando os atributos atraves do (super) e getters
    private double salario;

    // Criando construtor
    public Funcionario() { // Construtor
    }

    // Criando metodo bonifica��o para funcionarios e tribuindo abstract no metodo
    public abstract double getBonificacao(); // m�todo sem corpo, n�o h� implementa��o
    //return this.salario * 0.1;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
