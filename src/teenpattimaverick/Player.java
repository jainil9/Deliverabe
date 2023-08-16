
///**
// *
// * @author : Hrithik Solanki and Jainil Patel
// * @date : 14th August, 2023
// */

package teenpattimaverick;
import java.util.ArrayList;
import java.util.List;

public class Player {
    
    private List<String> players = new ArrayList<>();
    
    public void addPlayers(String name) {
        players.add(name);
    }

    public List<String> getPlayers() {
        return players;
    }
}
