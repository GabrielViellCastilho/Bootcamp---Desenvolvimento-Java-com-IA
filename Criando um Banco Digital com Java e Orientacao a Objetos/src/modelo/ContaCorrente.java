package modelo;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente, String agencia, String numero, Banco banco) {
        super(cliente, agencia, numero,banco);
        cliente.setContaCorrente(this);
    }


}
