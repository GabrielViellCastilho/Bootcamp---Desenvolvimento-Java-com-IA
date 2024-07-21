import modelo.*;

public class Main {
    public static void main(String[] args) {
        Banco banco1 = new Banco("Banco 1", "00.000.000/0001-00");
        Banco banco2 = new Banco("Banco 2", "11.111.111/0001-11");

        Cliente cliente1 = new Cliente("Cliente 1", "123.456.789-00", "1111-2222", "cliente1@example.com");
        Cliente cliente2 = new Cliente("Cliente 2", "987.654.321-00", "3333-4444", "cliente2@example.com");

        Conta contaCorrente1 = new ContaCorrente(cliente1,"1234","0012345-6",banco1);
        Conta contaCorrente2 = new ContaCorrente(cliente2,"5678","0023456-7",banco2);

        Conta contaPoupanca1 = new ContaPoupanca(cliente1,"1234","0034567-8",banco1);
        Conta contaPoupanca2 = new ContaPoupanca(cliente2,"5678","0045678-9",banco2);

        contaPoupanca1.exibirDadosConta();
        contaPoupanca1.deposito(25);
        System.out.println("");

        contaPoupanca1.exibirDadosConta();
        contaPoupanca1.saque(2.50);
        System.out.println("");

        contaPoupanca1.exibirDadosConta();
        contaPoupanca1.transferencia(10,"0045678-9",banco2);
        System.out.println("");

        contaPoupanca2.exibirDadosConta();
        System.out.println("");
        contaPoupanca1.exibirDadosConta();



    }
}