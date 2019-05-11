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
public class PlayerTest {
    @Test
    public void jogarCartaTest(){
        int pontuacao;
        Player jogador = new Player("Daniel");
        Deck baralho = new Deck();
        baralho.addCards();
        baralho.shuffle();
        Card carta = baralho.dealCard();
        jogador.takeCard(carta);
        pontuacao = jogador.playCard(carta);
        assertEquals(pontuacao, carta.getValue());
    }
}
