/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpsbrgame;

/**
 *
 * @author Aluno
 */
import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private String name;

    public Player(String name){
        this.hand = new ArrayList<>();
        this.name = name;
    }


    public void takeCard(Card card) {
        hand.add(card);
    }

    public int countHand(){
        return hand.size();
    }

    public int getHandValue(){
        int cardValues = 0;
        for (Card card : hand){
            int cardValue = card.getValue();
            cardValues += cardValue;
        }
        return cardValues;
    }

    public int playCard(Card carta) {
       if( hand.contains(carta) )
           return carta.getValue();
       else
           return 0;
    }
    
    
}
