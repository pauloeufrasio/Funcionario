//  Administrador é um funcionario, Administrador herda da classe funcionario, assina o contrato autenticavel
public class Administrador  extends Funcionario implements Autenticavel{
    private AutenticacaoUtil autenticador;

    public Administrador(){
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);

    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public double getBonificacao() {
        return 0;
    }
}

