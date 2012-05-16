/**
 * <copyright>
 * 
 * Copyright 2012 Burno Vicelli <brunodosax@hotmail.com>
 * Copyright 2012 Helison Teixeira <helisonreus@gmail.com>
 * 
 * Este programa e todos os materiais que o acompanham estão disponibilizados
 * sob a licença GPL versão 3, que acompanha esta distribuição e está disponível
 * em http://www.gnu.org/licenses/gpl.html
 * </copyright>
 */

package pds.baralho;

import java.util.ArrayList;

/**
 * Classe que cria o monte de descarte de baralho 
 * 
 * Universidade Federal do Pampa 
 * Graduação: Engenharia de Software
 * Disciplina: Práticas de Desenvolvimento de Software
 * Professor: Wagner de Melo Reck
 * Semestre: 5° - 2012/01
 * @author Helison Teixeira
 * @author Bruno Vicelli
 * @Version 1.0 @Date 14/05/2012
 */
public class MonteDescarte {

    private ArrayList<Carta> monteDescarte = new ArrayList<>();

    /**
     * Adiciona uma carta qualquer no monte de descarte
     *
     * @param carta
     */
    public void moverParaMonteDeDescarte(Carta carta) {
        carta.setnaipe(carta.getnaipe().toUpperCase());
        monteDescarte.add(carta);
    }

    /**
     * Cria uma carta utilizando o naipe e o numero passado e a envia para o
     * monte de descarte
     *
     * @param naipe
     * @param numero
     */
    public void moverParaMonteDeDescarte(String naipe, String numero) {
        String naipeUpper = naipe.toUpperCase();
        //naipe.toUpperCase();
        Carta carta = new Carta(naipeUpper, numero);
        monteDescarte.add(carta);
    }

    /**
     * Retona a carta do monte de descarte na posição escolhida
     *
     * @param posicao
     * @return carta dp
     */
    public Carta retornarCartaDoMonteDeDescarte(int posicao) {
        return monteDescarte.get(posicao);
    }

    /**
     * Retorna o ArrayList contendo todas as cartas do monte de discarte
     *
     * @return
     */
    public ArrayList<Carta> retornarMonteDeDescarte() {
        return monteDescarte;
    }

    /**
     * Remover uma carta do monte de descarte passando o objeto carta como
     * paremetro
     *
     * @param carta
     * @return
     */
    public Carta removeDoMonteDeDescarte(Carta carta) {
        carta.getnaipe().toUpperCase();
        for (int i = 0; i <= monteDescarte.size(); i++) {
            if (monteDescarte.contains(carta)) {
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
        String naipeUpper = naipe.toUpperCase();
        for (int i = 0; i <= monteDescarte.size(); i++) {
            if (monteDescarte.get(i).getnaipe().equals(naipeUpper) && monteDescarte.get(i).getNumero().equals(numero)) {
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
        naipe.toUpperCase();
        for (int i = 0; i <= monteDescarte.size(); i++) {
            if (monteDescarte.get(i).getnaipe().equals(naipe) && monteDescarte.get(i).getNumero().equals(numero)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /**
     * Metodo de teste para verificar se as funcoes que utilizam o monte de
     * descarte realmente estao ocorrendo.
     */
    public void exibirMonteDescarte() {
        for (int i = 0; i <= monteDescarte.size() - 1; i++) {
            System.out.println("numero: " + monteDescarte.get(i).getNumero() + ", naipe: " + monteDescarte.get(i).getnaipe());
        }
    }
}
