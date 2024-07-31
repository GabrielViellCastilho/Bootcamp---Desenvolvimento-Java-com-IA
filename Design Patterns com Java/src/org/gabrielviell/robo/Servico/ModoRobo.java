package src.org.gabrielviell.robo.Servico;



import src.org.gabrielviell.robo.Modelo.Robo;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface ModoRobo {
    Scanner scanner = new Scanner(System.in);
    void exibirFuncoes();
    void executarComando(Robo robo, int comando);

    default void esperandoComando(Robo robo) {
        try {
            this.exibirFuncoes();
            int comando = scanner.nextInt();
            this.executarComando(robo ,comando);
        }catch (InputMismatchException e) {
            System.out.println("\nEntrada inválida. Por favor, digite um número inteiro.\n");
            scanner.next();
        }

    }
}
