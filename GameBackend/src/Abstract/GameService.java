package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface GameService {
	void add(Game game);
	void delete(Game game);
	void sell(Game game, Gamer gamer);
	void sell(Game game, Gamer gamer, Campaign campaign);
}
