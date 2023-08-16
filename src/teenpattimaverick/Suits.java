
package teenpattimaverick;

/**
 *
 * @author : Hrithik Solanki and Jainil Patel
 * @date : 14th August, 2023
 */

public enum Suits {
    SPADE("♠"), HEART("♥"), DIAMOND("♦"), CLUB("♣");

    private final String symbol;

    Suits(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}