package src.org.gabrielviell.robo.Servico;



import src.org.gabrielviell.robo.Modelo.Robo;

import java.util.InputMismatchException;

import static src.org.gabrielviell.robo.Servico.ModoRobo.scanner;


public interface TrocaModo {
    default void trocaModo(Robo robo){

        System.out.println("\nEscolha o modo de configuração");
        System.out.println("1. Modo movimento");
        System.out.println("2. Modo comunicação");

        try {
            int valorComandoTroca = scanner.nextInt();
        switch (valorComandoTroca){
            case 1:
                robo.setModoRobo(ModoMovimento.getInstancia());
                System.out.println("\nModo movimento ativado com sucesso!\n");
                break;
            case 2:
                    robo.setModoRobo(ModoComunicacao.getInstancia());
                    System.out.println("\nModo comunicação ativado com sucesso!\n");
                    break;
            default:
                System.out.println("\nValor invalido!\n");
                break;
            }
        }catch (InputMismatchException e) {
            System.out.println("\nEntrada inválida. Por favor, digite um número inteiro.\n");
            scanner.next();
        }
    }
};

