package pds.baralho;

/**
 *
 * @author Helison Teixeira
 * @author Bruno Vicelli
 * @version 1.5 @Date 23/04/2012
 *
 */
public class Carta {

    private String naipe;
    private String numero;

    /**
     * Construtor da classe Carta com seu naipe e numero.
     *
     * @param naipe
     * @param numero
     */
    public Carta(String naipe, String numero) {

        this.naipe = naipe.toUpperCase();
        this.numero = numero;
    }

    /**
     * Retorna o naipe da carta
     *
     * @return
     */
    public String getnaipe() {
        return naipe;
    }

    /**
     * Retorna o numero da carta
     *
     * @return
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define o naipe da carta
     *
     * @param naipe
     */
    public void setnaipe(String naipe) {

        this.naipe = naipe.toUpperCase();
    }

    /**
     * Define o numero da carta
     *
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
}
