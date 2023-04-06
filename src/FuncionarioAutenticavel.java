public abstract class FuncionarioAutenticavel extends Funcionario {
    private int senha;

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
}
