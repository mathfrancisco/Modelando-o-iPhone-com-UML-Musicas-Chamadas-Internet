package apps.multifuncional;

import apps.internet.NavegadorInternet;
public class Iphone implements  NavegadorInternet {


    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url + " - via Iphone.");
    }
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada - via Iphone.");
    }
    public void atualizarPagina() {
        System.out.println("Página atualizada - via Iphone.");
    }


    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero + " - via Iphone.");
    }
    public void atender() {
        System.out.println("Ligação atendida - via Iphone.");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz - via Iphone.");
    }


    public void tocar() {
        System.out.println("Tocando música selecionada - via Iphone.");
    }
    public void pausar() {
        System.out.println("Música pausada - via Iphone.");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica + " - via Iphone.");
    }

}
