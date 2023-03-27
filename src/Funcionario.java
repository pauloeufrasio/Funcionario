public class Funcionario {
    private String nome;
    private String cpf;
    // Alterando Atributo salario pra protected onde que só a classe filho pode acessar esse atributo atraves da chamada (super)
    protected double salario;

    // Criando construtor
    public  Funcionario(){
    }
    // Criando metodo bonificação para funcionarios comum
    public double getBonificacao(){
        return this.salario * 0.1;
    }

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
