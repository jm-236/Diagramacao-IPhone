package com.celular;

import com.navegador.Navegador;
import com.telefone.Telefone;
import com.reprodutormusical.ReprodutorMusical;

public class Iphone implements Navegador, Telefone, ReprodutorMusical{

    boolean emLigacao = false;
    String musicaAtual = "";
    boolean estaTocando = false;
    String URL_atual = "";

    @Override
    public void tocar() {
        System.out.println("Tocando a música" + this.musicaAtual);
    }

    @Override
    public void pausar() {
        this.estaTocando = false;
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Selecionando música: " + musica);

    }

    @Override
    public void ligar(String numero) {
        this.emLigacao = true;
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        this.emLigacao = true;
        System.out.println("Atendendo ligação");
    }

    @Override
    public void desligarLigacao() {
        this.emLigacao = false;
        System.out.println("Desligando ligação");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Stairway to Heaven");
        iphone.ligar("123456789");
        iphone.atender();
        iphone.desligarLigacao();
        iphone.iniciarCorreioDeVoz();
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }

}
