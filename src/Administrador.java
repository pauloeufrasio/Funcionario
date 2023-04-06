public class Administrador extends FuncionarioAutenticavel{
    @Override
    public double getBonificacao() {
        // Definindo regra de bonificação especifica do Administrador
        return 50;
    }
}
