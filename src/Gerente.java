// gerente é um funcionario, Gerente herda do funcionario
public class Gerente extends Funcionario {

    private int senha = 0;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    // Criando metodo autentica que recebe senha como parametro obs esse metodo é especifica da classe Gerente
    public boolean autentica(int senha){
        if (this.senha == senha ) {
            return true;
        } else {
            return  false;
        }
    }
    // Modificando getBonificação e retirando protected do atributo da classe funcionario e accesando atraves do super.getBonificacao() + super.getSalario()
    public double getBonificacao(){
        return super.getBonificacao() +super.getSalario();

    }
}
