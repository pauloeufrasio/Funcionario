public class TesteGerente {
    public static void main(String[] args) {
        // Instanciando classe gerente e verificado se ele herdou da classe funcionario
        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setCpf("223355646-9");
        g1.setSalario(2600.00);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        // Criando senha pro metodo autentica
        g1.setSenha(1234);
        // Criando variavel pra verificar se autentica a senha do gerente marcos
        boolean autenticou = g1.autentica(1234); // esse metodo esta dentro da classe gerente
        // Printando na tela pra ver se autenticou
        System.out.println(autenticou);
        System.out.println(g1.getBonificacao());
    }
}
