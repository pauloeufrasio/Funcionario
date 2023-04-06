// Composição com java
public class AutenticacaoUtil {

    private int senha;

    public void setSenha(int senha) {

    }

    public boolean autentica(int senha) {
        if (senha == this.senha) {
            return true;
        } else {
            return false;
        }
    }
}
