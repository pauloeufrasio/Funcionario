public class EditorVideo extends Funcionario {
    public double getBonificacao(){
        System.out.println("Chamando o m�todo de bonifica��o do editor de video");
        return super.getBonificacao() + 100;
    }
}
