/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pds;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Bruno
 */
public class BaralhoTest {
    
    public BaralhoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of embaralhar method, of class Baralho.
     */
    @Test
    public void testEmbaralhar_0args() {
        System.out.println("embaralhar");
        Baralho instance = new Baralho();
        instance.embaralhar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of embaralhar method, of class Baralho.
     */
    @Test
    public void testEmbaralhar_int() {
        System.out.println("embaralhar");
        int voltas = 4;
        Baralho instance = new Baralho();
        instance.embaralhar(voltas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cortar method, of class Baralho.
     */
    @Test
    public void testCortar() {
        System.out.println("cortar");
        int posicao = 0;
        Baralho instance = new Baralho();
        boolean expResult = false;
        boolean result = instance.cortar(posicao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrimeiraCarta method, of class Baralho.
     */
    @Test
    public void testGetPrimeiraCarta() {
        System.out.println("getPrimeiraCarta");
        Baralho instance = new Baralho();
        Carta expResult = null;
        Carta result = instance.getPrimeiraCarta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUltimaCarta method, of class Baralho.
     */
    @Test
    public void testGetUltimaCarta() {
        System.out.println("getUltimaCarta");
        Baralho instance = new Baralho();
        Carta expResult = null;
        Carta result = instance.getUltimaCarta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moverPrimeiraParaOFim method, of class Baralho.
     */
    @Test
    public void testMoverPrimeiraParaOFim() {
        System.out.println("moverPrimeiraParaOFim");
        Baralho instance = new Baralho();
        instance.moverPrimeiraParaOFim();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaNoBaralho method, of class Baralho.
     */
    @Test
    public void testEstaNoBaralho_String_String() {
        System.out.println("estaNoBaralho");
        String naipe = "";
        String numero = "";
        Baralho instance = new Baralho();
        boolean expResult = false;
        boolean result = instance.estaNoBaralho(naipe, numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaNoBaralho method, of class Baralho.
     */
    @Test
    public void testEstaNoBaralho_Carta() {
        System.out.println("estaNoBaralho");
        Carta carta = null;
        Baralho instance = new Baralho();
        boolean expResult = false;
        boolean result = instance.estaNoBaralho(carta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exibirBaralhoCompleto method, of class Baralho.
     */
    @Test
    public void testExibirBaralhoCompleto() {
        System.out.println("exibirBaralhoCompleto");
        Baralho instance = new Baralho();
        instance.exibirBaralhoCompleto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
