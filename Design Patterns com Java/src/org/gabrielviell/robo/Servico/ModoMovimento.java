package src.org.gabrielviell.robo.Servico;


import src.org.gabrielviell.robo.Modelo.Robo;

public class ModoMovimento implements ModoRobo, TrocaModo {

    private static ModoMovimento instancia = new ModoMovimento();

    @Override
    public void executarComando(Robo robo, int comando) {

        switch (comando){
            case 1:
                System.out.println("\nAndando para frente!\n");
                robo.setPosicaoY(robo.getPosicaoY()+1);
                break;
            case 2:
                System.out.println("\nAndando para trás!\n");
                robo.setPosicaoY(robo.getPosicaoY()-1);
                break;
            case 3:
                System.out.println("\nAndando para esquerda!\n");
                robo.setPosicaoX(robo.getPosicaoX()-1);
                break;
            case 4:
                System.out.println("\nAndando para direita!\n");
                robo.setPosicaoX(robo.getPosicaoX()+1);
                break;
            case 5:
                trocaModo(robo);
                break;
            case 6:
                robo.mostrarStatus();
                break;
            case 7:
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
        System.out.println("Modo Movimento");
        System.out.println("Funções disponíveis:");
        System.out.println("1. Andar para frente");
        System.out.println("2. Andar para trás");
        System.out.println("3. Andar para esquerda");
        System.out.println("4. Andar para direita");
        System.out.println("5. Trocar modo de configuração");
        System.out.println("6. Mostrar Status");
        System.out.println("7. Desligar");
    }

    public static ModoMovimento getInstancia() {
        return instancia;
    }

    @Override
    public String toString() {
        return "ModoMovimento";
    }
}
