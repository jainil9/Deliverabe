/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teenpattimaverick;

/**
 *
 * @author : Hrithik Solanki and Jainil Patel
 * @date : 14th August, 2023
 */

public class Game {

    private String winnerName;
    private String reason;
    private int score;
    private String cards;

    public Game(String winnerName, String reason, int score, String cards) {
        this.winnerName = winnerName;
        this.reason = reason;
        this.score = score;
        this.cards = cards;
    }

    public String getWinnerName() {
        return winnerName;
    }

    public String getReason() {
        return reason;
    }

    public int getScore() {
        return score;
    }

    public String getCards() {
        return cards;
    }
}