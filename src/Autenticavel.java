
//contrato Autenticavel
//quem assinar esse contrato precisa implementar
//metodo setSenha
//metodo autentica
public abstract interface Autenticavel{ // interface grafica e apenas uma definição

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
    }