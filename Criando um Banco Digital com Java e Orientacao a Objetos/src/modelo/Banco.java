package modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> listaContas = new ArrayList<Conta>();
    private String nome;
    private String cnpj;

    public Banco(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getListaContas() {
        return listaContas;
    }
}
