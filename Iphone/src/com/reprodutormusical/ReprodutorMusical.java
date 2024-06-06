package com.reprodutormusical;

public interface ReprodutorMusical {

    String musicaAtual = "";
    boolean estaTocando = false;

    public void tocar();
    public void pausar();
    public void selecionarMusica(String musica);
}
