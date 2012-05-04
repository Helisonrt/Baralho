package pds.baralho;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Biblioteca java que trabalha com funcoes de um baralho com 52 cartas.
 *  *
 * @author Helison Teixeira
 * @author Bruno Vicelli
 * @Version 1.0 
 * @Date 19/04/2012
 */
public class Baralho {

    private ArrayList<Carta> baralhoCompleto = new ArrayList<>();
    private ArrayList<Carta> monteDescarte = new ArrayList<>();

    /**
     * Construtor do baralho.
     * Cria um baralho com 52 cartas, sem curinga.
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
        //for (int i =0; i<200;i++){
        //Random rand = new Random();
        //Carta carta;
        //int num = rand.nextInt(52);
        //carta = baralhoCompleto.remove(num);
        //fullDeck.add(carta);
        //  }

    }

    /**
     * Corta o Baralho na posicao informada pelo usuario e o remonta
     * @param posicao
     */
    public boolean cortar(int posicao) {
        ArrayList<Carta> parte1 = new ArrayList<>();
        ArrayList<Carta> parte2 = new ArrayList<>();
        if (posicao>2){
        for (int i = 0; i < posicao; i++) {
            parte1.add(baralhoCompleto.remove(i));
        }
        parte2.addAll(baralhoCompleto);
        baralhoCompleto.clear();
        baralhoCompleto.addAll(parte2);
        baralhoCompleto.addAll(parte1);
        return true;
        }
        else
            return false;
    }

    /**
     * Retorna a primeira carta do baralho
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
     * Adiciona a carta no monte de descarte.
     * 
     * Metodo somente deve ser utilizado caso haja somente uma instanciação do baralho
     *
     * @param carta
     */
    public boolean moverParaMonteDeDescarte(Carta carta) {
        if (!baralhoCompleto.contains(carta)) {
            monteDescarte.add(carta);
            return true;
        }
        else
            return false;
    }
    
    //CRIAR UM METODO QUE ADICIONA UMA CARTA QUALQUER AO BARALHO SEM TRATAMENTO

    /**
     * Retona a carta do monte de descarte na posição escolhida
     *
     * @param posicao
     * @return carta dp
     */
    
    public Carta visualizarCartaDoMonteDeDescarte(int posicao) {
        return monteDescarte.get(posicao);
    }

    /**
     * Retorna o ArrayList contendo todas as cartas do monte de discarte
     *
     * @return
     */
    public ArrayList<Carta> visualizarMonteDeDescarte() {
        return monteDescarte;
    }
    //CRIAR MAIS UM PARA REmOVER A CARTA DO MONTE DE DESCARTE

    /**
     * Metodo de teste para verificar se as funcoes que utilizam o fulldeck
     * realmente estao ocorrendo Como por exemplo, embaralhar, remover carta,
     * mover carta, entre outras
     */
    public void exibirBaralhoCompleto() {
        for (int i = 0; i < 52; i++) {
            System.out.println("numero: " + baralhoCompleto.get(i).getNumero() + ", naipe: " + baralhoCompleto.get(i).getnaipe());
        }
    }
}
