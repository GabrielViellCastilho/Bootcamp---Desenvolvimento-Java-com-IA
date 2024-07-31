package src.org.gabrielviell.robo.Modelo;


import src.org.gabrielviell.robo.Servico.ModoMovimento;
import src.org.gabrielviell.robo.Servico.ModoRobo;

public class Robo {
    private String nome;
    private String descricao;
    private ModoRobo modoRobo = ModoMovimento.getInstancia(); ;
    private int posicaoX = 0;
    private int posicaoY = 0;
    private boolean ativo = true;

    private Robo(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void esperandoComando(Robo robo){
        modoRobo.esperandoComando(robo);
    }

    public void mostrarStatus(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "\n\nNome: " + nome + "\nDescrição: " + descricao +
                 "\nModo de Configuração: " + modoRobo + "\nPosição X: " + posicaoX +
                "\nPosição y: " + posicaoY + "\nAtivo: " + ativo +"\n\n";
    }


    public static class RoboBuilder{
        private String nome;
        private String descricao;

        public RoboBuilder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public RoboBuilder setDescricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public  Robo build(){
            return new Robo(nome, descricao);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public ModoRobo getModoRobo() {
        return modoRobo;
    }

    public void setModoRobo(ModoRobo modoRobo) {
        this.modoRobo = modoRobo;
    }


}
