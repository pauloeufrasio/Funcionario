public class ControleBonificacao {

    private double soma;
    // Criando metodo que registra todos funcionario usando de referencia funcionario
    public void registra(Funcionario f) {
        double boni = f.getBonificacao(); // a bonificacao é especifica de cada funcionario ou seja cada um tem bonificacao diferente
        this.soma = this.soma + boni;
    }


    public double getSoma() {
        return soma;
    }
}
