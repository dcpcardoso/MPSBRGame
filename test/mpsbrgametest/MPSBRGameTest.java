/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpsbrgametest;

import mpsbrgame.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class MPSBRGameTest {
    private Player p1;
    private Player p2;
    private Game jogo;
    
    @Before
    public void inicializaJogo(){
    jogo = new Game();
    
    p1 = new Player("P1");
    p2 = new Player("P2");
    
    jogo.addPlayer(p1);
    jogo.addPlayer(p2);
    
    p1.takeCard(new Card(Suit.CLUBS, Rank.FOUR));
    p1.takeCard(new Card(Suit.CLUBS, Rank.FIVE));
    p1.takeCard(new Card(Suit.CLUBS, Rank.SIX));
    
    p2.takeCard(new Card(Suit.CLUBS, Rank.FIVE));
    p2.takeCard(new Card(Suit.CLUBS, Rank.FOUR));
    p2.takeCard(new Card(Suit.CLUBS, Rank.SEVEN));
    
    
    }
    
    @Test
    public void testaJogarSimples(){
        Player ganhador = jogo.jogar(p1.getCard(1), p2.getCard(1));
        assertEquals(p1, ganhador);
    }
}
