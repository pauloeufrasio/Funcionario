public class TesteSistema {
    public static void main(String[] args) {
        Gerente paulo = new Gerente();
        paulo.setSenha(222);

        Administrador adm = new Administrador();
        adm.setSenha(222);

        SistemaInterno sis = new SistemaInterno();
        sis.autentica(paulo);
        sis.autentica(adm);

    }
}
