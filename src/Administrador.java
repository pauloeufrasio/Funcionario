public class Administrador extends FuncionarioAutenticavel{
    @Override
    public double getBonificacao() {
        // Definindo regra de bonifica��o especifica do Administrador
        return 50;
    }
}
