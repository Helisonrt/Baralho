/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pds.baralho;

import java.util.ArrayList;

/**
 *
 * @author Helison
 */
public class MonteDescarte {

    private ArrayList<Carta> monteDescarte = new ArrayList<>();

    /**
     * Adiciona a carta no monte de descarte.
     *
     * Metodo somente deve ser utilizado caso haja somente uma instanciação do
     * baralho
     *
     * @param carta
     */
    public boolean moverParaMonteDeDescarte(Carta carta) {

        Baralho baralho = new Baralho();

        if (baralho.estaNoBaralho(carta)) {
            monteDescarte.add(carta);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo que verifica se a carta existe no baralho através de seu naipe e
     * numero, e o envia para o monte de descarte
     *
     * @param naipe
     * @param numero
     * @return
     */
    public boolean moverParaMonteDeDescarte(String naipe, String numero) {
        Baralho baralho = new Baralho();

        Carta carta = new Carta(naipe, numero);
        if (baralho.estaNoBaralho(naipe, numero)) {
            monteDescarte.add(carta);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Adiciona uma carta qualquer no monte de descarte
     *
     * @param carta
     */
    public void moverParaMonteDeDescarteSemTratamento(Carta carta) {
        monteDescarte.add(carta);
    }

    /**
     * Cria uma carta utilizando o naipe e o numero passado e a envia para o
     * monte de descarte
     *
     * @param naipe
     * @param numero
     */
    public void moverParaMonteDeDescarteSemTratamento(String naipe, String numero) {
        Carta carta = new Carta(naipe, numero);
        monteDescarte.add(carta);
    }

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
     * Remover uma carta do monte de descarte passando o objeto carta como
     * paremetro
     *
     * @param carta
     * @return
     */
    public Carta removeDoMonteDeDescarte(Carta carta) {
        for (int i = 0; i <= monteDescarte.size(); i++) {
            if (monteDescarte.contains(i)) {
                carta = monteDescarte.remove(i);
            }
        }
        return carta;
    }

    /**
     * Remove uma carta do monte de descarte passando o seu numero e o seu naipe
     *
     * @param naipe
     * @param numero
     * @return
     */
    public Carta removeDoMonteDeDescarte(String naipe, String numero) {
        Carta carta = null;
        for (int i = 0; i <= monteDescarte.size(); i++) {
            if (monteDescarte.get(i).getnaipe().equals("naipe") && monteDescarte.get(i).getNumero().equals("numero")) {
                carta = monteDescarte.remove(i);
            }
        }
        return carta;
    }

    /**
     * Metodo que verifica se a carta com o naipe e o numero passado
     * encontram-se no monte de descarte
     *
     * @param naipe
     * @param numero
     * @return
     */
    public boolean estaNoMonteDescarte(String naipe, String numero) {
        for (int i = 0; i <= monteDescarte.size(); i++) {
            if (monteDescarte.get(i).getnaipe().equals("naipe") && monteDescarte.get(i).getNumero().equals("numero")) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
        /**
     * Metodo de teste para verificar se as funcoes que utilizam o monte de descarte
     * realmente estao ocorrendo.
     */
    public void exibirMonteDescarte() {
        for (int i = 0; i < 52; i++) {
            System.out.println("numero: " + monteDescarte.get(i).getNumero() + ", naipe: " + monteDescarte.get(i).getnaipe());
        }
    }

}
