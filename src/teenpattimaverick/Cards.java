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

public enum Cards {
    ACE("A", 14), TWO("2", 2), THREE("3", 3), FOUR("4", 4), FIVE("5", 5), SIX("6", 6),
    SEVEN("7", 7), EIGHT("8", 8), NINE("9", 9), TEN("10", 10), JACK("J", 11),
    QUEEN("Q", 12), KING("K", 13);

    private final String cardName;
    private final int value;

    Cards(String cardName, int value) {
        this.cardName = cardName;
        this.value = value;
    }

    public String getCardName() {
        return cardName;
    }

    public int getValue() {
        return value;
    }
}