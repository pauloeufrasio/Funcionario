public class SistemaInterno {
    private int senha = 222;
    public void autentica(FuncionarioAutenticavel g){
        g.autentica(this.senha);
        boolean autenticou = g.autentica(this.senha);
        if (autenticou){
            System.out.println("Voce pode entrar no sistema ");
        }
        else {
            System.out.println("Você não pode entrar no sistema");
        }
    }
}
