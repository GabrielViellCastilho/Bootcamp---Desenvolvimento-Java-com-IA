package servico;

import modelo.Banco;

public interface ServicoConta {
    void deposito(double valor);
    void saque(double valor);
    void transferencia(double valor, String numero, Banco banco);
    void exibirDadosConta();

}
