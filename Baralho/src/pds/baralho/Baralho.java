package pds.baralho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Biblioteca java que trabalha com funcoes de um baralho com 52 cartas.
 *
 *
 * @author Helison Teixeira
 * @author Bruno Vicelli
 * @Version 1.0 @Date 19/04/2012
 */
public class Baralho {

    private ArrayList<Carta> baralhoCompleto = new ArrayList<>();

    /**
     * Construtor do baralho. Cria um baralho com 52 cartas, sem curinga.
     */
    public Baralho() {
        ArrayList<String> numeros = new ArrayList<>();
        ArrayList<String> naipes = new ArrayList<>();
        numeros.add("A");
        numeros.add("2");
        numeros.add("3");
        numeros.add("4");
        numeros.add("5");
        numeros.add("6");
        numeros.add("7");
        numeros.add("8");
        numeros.add("9");
        numeros.add("10");
        numeros.add("J");
        numeros.add("Q");
        numeros.add("K");
        naipes.add("Copas");
        naipes.add("Ouro");
        naipes.add("Espada");
        naipes.add("Paus");
        Carta carta;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                carta = new Carta(naipes.get(i), numeros.get(j));
                baralhoCompleto.add(carta);

            }
        }

    }

    /**
     * Metodo que embaralha as cartas do jogo
     *
     */
    public void embaralhar() {
        Collections.shuffle(baralhoCompleto);

    }

    /**
     * Metodo que embaralha o baralho e utilizando o parametro voltas para
     * definir quantas cartas serao mudadas.
     *
     * Recomendado que o numero voltas seja no minimo 100, para garantir um bom
     * embaralhamentoo.
     *
     * @param voltas
     */
    public void embaralhar(int voltas) {
        for (int i = 0; i < voltas; i++) {
            Random rand = new Random();
            Carta carta;
            int num = rand.nextInt(51);
            carta = baralhoCompleto.remove(num);
            baralhoCompleto.add(carta);
        }
    }

    /**
     * Corta o Baralho na posicao informada pelo usuario e o remonta
     *
     * @param posicao
     * @return true se possível cortar, false caso nao seja possível
     */
    public boolean cortar(int posicao) {
        ArrayList<Carta> parte1 = new ArrayList<>();
        ArrayList<Carta> parte2 = new ArrayList<>();
        if (posicao > 2) {
            for (int i = 0; i < posicao; i++) {
                parte1.add(baralhoCompleto.remove(i));
            }
            parte2.addAll(baralhoCompleto);
            baralhoCompleto.clear();
            baralhoCompleto.addAll(parte2);
            baralhoCompleto.addAll(parte1);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna a primeira carta do baralho
     *
     * @return
     *
     */
    public Carta getPrimeiraCarta() {
        return baralhoCompleto.remove(0);
    }

    /**
     * Retorna a ultima carta do baralho
     *
     * @return
     */
    public Carta getUltimaCarta() {
        return baralhoCompleto.remove(baralhoCompleto.lastIndexOf(this));
    }

    /**
     * Move a primeira carta do baralho para o final.
     */
    public void moverPrimeiraParaOFim() {
        baralhoCompleto.add(baralhoCompleto.remove(0));
    }

    /**
     * Metodo que verifica se a carta com o naipe e o numero passado
     * encontram-se no monte de descarte.
     *
     * @param naipe
     * @param numero
     * @return
     */
    public boolean estaNoBaralho(String naipe, String numero) {
        for (int i = 0; i <= baralhoCompleto.size(); i++) {
            if (baralhoCompleto.get(i).getnaipe().equals("naipe") && baralhoCompleto.get(i).getNumero().equals("numero")) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /**
     * Verifica se a carta está no baralho
     * @param carta
     * @return 
     */
    boolean estaNoBaralho(Carta carta) {

        for (int i = 0; i <= baralhoCompleto.size(); i++) {
            if (baralhoCompleto.get(i).getnaipe().equals(carta.getnaipe()) && baralhoCompleto.get(i).getNumero().equals(carta.getNumero())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
        /**
     * Metodo de teste para verificar se as funcoes que utilizam o baralho completo
     * realmente estao ocorrendo Como por exemplo, embaralhar, remover carta,
     * mover carta, entre outras
     */
    public void exibirBaralhoCompleto() {
        for (int i = 0; i < 52; i++) {
            System.out.println("numero: " + baralhoCompleto.get(i).getNumero() + ", naipe: " + baralhoCompleto.get(i).getnaipe());
        }
    }

}
