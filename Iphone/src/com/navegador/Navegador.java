package com.navegador;

public interface Navegador {
    String URL_atual = "";

    public void exibirPagina(String url);
    public void adicionarNovaAba();
    public void atualizarPagina();
}
