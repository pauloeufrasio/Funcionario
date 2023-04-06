// gerente é um funcionario, Gerente herda do funcionarioAutenticavel
public class Gerente extends FuncionarioAutenticavel {


    // Modificando getBonificação e retirando protected do atributo da classe funcionario e accesando atraves do super.getBonificacao() + super.getSalario()
    public double getBonificacao(){
        System.out.println("Estou chamando o método bonificação do GERENTE ");
        return super.getSalario();

    }
}
