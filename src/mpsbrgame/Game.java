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

public class Game {
    private ArrayList<Player> players;
    private Dealer dealer;


    public Game(){
        this.players = new ArrayList<>();
        this.dealer = new Dealer();
    }


    public void addPlayer(Player player) {
        players.add(player);
    }

    public int countPlayers() {
        return players.size();
    }

    public void dealGame() {
        for (Player player : players){
            dealer.dealCard(player);
        }
    }

    public String checkWinner() {
        ArrayList<Integer> cardValues = new ArrayList<>();
        for (Player player : players) {
            int cardValue = player.getHandValue();
            cardValues.add(cardValue);
        }
        return "Someone wins";
    }

}
