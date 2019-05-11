/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpsbrgametest;

import mpsbrgame.*;
import org.junit.*;

/**
 *
 * @author Aluno
 */
public class MPSBRGameTest {
    
    @Test
    public void comprarCartaTest(){
        Deck baralho = new Deck();
        baralho.addCards();
        Card carta = baralho.dealCard();
        System.out.println("Carta "+carta.getValue()+" de "+carta.getSuit());
    }
}
