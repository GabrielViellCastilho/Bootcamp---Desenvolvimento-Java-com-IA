package modelo;

import servico.ServicoConta;

import java.util.NoSuchElementException;
import java.util.Objects;

public  abstract class  Conta implements ServicoConta {

    protected final String AGENCIA;
    protected final String NUMERO;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;

    protected Conta(Cliente cliente, String agencia, String NUMERO, Banco banco) {
        this.cliente = cliente;
        this.AGENCIA = agencia;
        this.NUMERO = NUMERO;
        this.saldo = 0;
        this.banco = banco;

        banco.getListaContas().add(this);
    }

    @Override
    public void deposito(double valor) {
        saldo += valor;

        System.out.println("--------------------------");
        System.out.println("Deposito realizado com sucesso!");
        this.exibirSaldo();
        System.out.println("--------------------------");
    }

    @Override
    public void saque(double valor) {
        if (saldo >= valor) {
        saldo -= valor;

            System.out.println("--------------------------");
        System.out.println("Saque realizado com sucesso!");
        this.exibirSaldo();
        System.out.println("--------------------------");}

        else  throw new RuntimeException("Saldo insuficiente!");
    }

    @Override
    public void transferencia(double valor, String numero, Banco banco) {
        if (saldo >= valor) {
        this.saldo -= valor;

        Conta contaEncontrada = banco.getListaContas().stream()
                .filter(conta -> conta.getNumero().equalsIgnoreCase(numero))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Conta não encontrada"));

        contaEncontrada.setSaldo(contaEncontrada.getSaldo() + valor);

        System.out.println("--------------------------");
        System.out.println("Transferência realizada com sucesso!");
        this.exibirSaldo();
        System.out.println("--------------------------");}

        else throw new RuntimeException("Saldo insuficiente!");


    }

    @Override
    public void exibirDadosConta() {
        System.out.println("--------------------------");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Banco: " + banco.getNome());
        System.out.println("Agência: " + AGENCIA);
        System.out.println("Número: " + NUMERO);
        this.exibirSaldo();
        System.out.println("--------------------------");
    }


    private void exibirSaldo(){System.out.println(String.format("Saldo: R$ %.2f", saldo));;
    }

    protected String getNumero() {
        return NUMERO;
    }

    protected double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
