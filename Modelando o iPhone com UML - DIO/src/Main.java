import org.gabrielviell.iphone.model.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        System.out.println("\n//////////////////////////\nAparelho Telefônico \n//////////////////////////\n");;
        iphone.ligar("12345678");
        iphone.atender();
        System.out.println("");
        iphone.ligar("12345678");
        iphone.iniciarCorreioVoz();
        System.out.println("\n//////////////////////////\nReprodutor Musical \n//////////////////////////\n");;
        iphone.selecionarMusica("Música Legal");
        iphone.tocar();
        iphone.pausar();
        System.out.println("\n//////////////////////////\nNavegador Internet \n//////////////////////////\n");
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://github.com/GabrielViellCastilho");
        iphone.atualizarPagina();

    }
}