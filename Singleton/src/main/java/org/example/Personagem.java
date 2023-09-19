package org.example;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Personagem {
    private Personagem() {};
    private static Personagem instance = new Personagem();
    public static Personagem getInstance() {
        return instance;
    }

    private String nomePersonagem;
    private Integer idadePersonagem;

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public Integer getIdadePersonagem() {
        return idadePersonagem;
    }

    public void setIdadePersonagem(Integer idadePersonagem) {
        this.idadePersonagem = idadePersonagem;
    }
}