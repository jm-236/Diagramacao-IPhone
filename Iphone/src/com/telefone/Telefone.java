package com.telefone;

public interface Telefone {

    boolean emLigacao = false;

    public void ligar(String numero);
    public void atender();
    public void desligarLigacao();
    public void iniciarCorreioDeVoz();
}
