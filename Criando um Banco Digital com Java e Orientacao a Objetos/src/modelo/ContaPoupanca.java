package modelo;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente, String agencia, String numero, Banco banco) {
        super(cliente, agencia, numero,banco);
        cliente.setContaPoupanca(this);
    }
}
