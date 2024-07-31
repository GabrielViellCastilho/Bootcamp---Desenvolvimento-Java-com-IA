package src.org.gabrielviell.robo.Servico;


import src.org.gabrielviell.robo.Modelo.Robo;

public class ModoComunicacao implements ModoRobo, TrocaModo {

    private static ModoComunicacao instancia = new ModoComunicacao();

    @Override
    public void executarComando(Robo robo, int comando) {

        switch (comando){
            case 1:
                System.out.println("\nAcenando ...\n");
                break;
            case 2:
                System.out.println("\nApertando a mão ...\n");
                break;
            case 3:
                System.out.println("\nApontando ...\n");
                break;
            case 4:
                System.out.println("\nBalançando a cabeça...\n");
                break;
            case 5:
                System.out.println("\nFazendo o sinal da paz...\n");
                break;
            case 6:
                System.out.println("\nAbraçando...\n");
                break;
            case 7:
                System.out.println("\nDançando...\n");
                break;
            case 8:
                System.out.println("\nAplaudindo...\n");
                break;
            case 9:
                System.out.println("\nRecolhendo...\n");
                break;
            case 10:
                System.out.println("\nSaudando...\n");
                break;
            case 11:
                trocaModo(robo);
                break;
            case 12:
                robo.mostrarStatus();
                break;
            case 13:
                System.out.println("\nDesligando ...\n");
                robo.setAtivo(false);
                break;
            default:
                System.out.println("\nValor Inválido\n");
                break;
        }
    }

    @Override
    public void exibirFuncoes() {
        System.out.println("Modo Comunicação");
        System.out.println("Funções de Comunicação do Robô:");
        System.out.println("1. Aceno de Mão");
        System.out.println("2. Apertar a Mão");
        System.out.println("3. Apontar");
        System.out.println("4. Balanço de Cabeça");
        System.out.println("5. Sinal de Paz");
        System.out.println("6. Abraços");
        System.out.println("7. Dançar");
        System.out.println("8. Aplaudir");
        System.out.println("9. Recolher-se");
        System.out.println("10. Saudação Formal");
        System.out.println("11. Trocar modo de configuração");
        System.out.println("12. Mostrar Status");
        System.out.println("13. Desligar");
    }

    @Override
    public String toString() {
        return "Modo Comunicação";
    }

    public static ModoComunicacao getInstancia() {
        return instancia;
    }
}
