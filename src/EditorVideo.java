public class EditorVideo extends Funcionario {
    public double getBonificacao(){
        System.out.println("Chamando o método de bonificação do editor de video");
        return super.getBonificacao() + 100;
    }
}
