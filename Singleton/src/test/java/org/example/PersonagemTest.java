package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonagemTest {
    @Test
    public void deveRetornarNomePersonagem(){
        Personagem.getInstance().setNomePersonagem("Cashiel");
        assertEquals("Cashiel", Personagem.getInstance().getNomePersonagem());
    }

    @Test
    public void deveRetornarIdadePersonagem(){
        Personagem.getInstance().setIdadePersonagem(14);
        assertEquals(14, Personagem.getInstance().getIdadePersonagem());
    }
}