public class TesteReferencia {

    public static void main(String[] args) {
        // polimofismo é um objeto que pode ser referenciado atraves de uma referencia do mesmo tipo
        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);
        // Criando funcionario f e atribuindo um valor pro salario
        Funcionario f = new Funcionario();
        f.setSalario(2000.0);
        // Criando funcionario ev e atribuindo um valor pro salario
        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);
        // Instanciando classe ControleBonificacao e registrando os funcionarios
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f);
        controle.registra(ev);

        System.out.println(controle.getSoma());
    }
}