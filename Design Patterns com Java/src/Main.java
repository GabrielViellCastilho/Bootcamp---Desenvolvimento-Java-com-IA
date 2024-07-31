package src;


import src.org.gabrielviell.robo.Modelo.Robo;

public class Main {
    public static void main(String[] args) {


        Robo robo = new Robo.RoboBuilder().setNome("Robo1")
                    .setDescricao("Um robô avançado com várias funções.").build();

        System.out.println(robo);
        while (robo.isAtivo()){
        robo.esperandoComando(robo);
    }
        System.out.println("\nPrograma finalizado com sucesso!");
}
}
