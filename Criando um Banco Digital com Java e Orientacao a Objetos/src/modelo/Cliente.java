package modelo;

public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;

    public Cliente(String nome, String cpf,  String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;

    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }


    public String getNome() {
        return nome;
    }


}
