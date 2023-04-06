public class TesteFuncionario {

    public static void main(String[] args) {
        // Instanciando classe gerente e criando um funcionario nico
        Gerente nico = new Gerente();
        nico.setNome("Nico Steppat");
        nico.setCpf("223355646-9");
        nico.setSalario(2600.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

    }
}