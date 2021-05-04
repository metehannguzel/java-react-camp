import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		Gamer gamer1 = new Gamer("Metehan Kürşat", "Güzel", 2000, "53164674006");
		
		gamerManager.register(gamer1);
		
		System.out.println("-------------------------");
		
		CampaignManager campaignManager = new CampaignManager();	
		Campaign campaign1 = new Campaign(1, "Summer Sales", 0.10);
		
		campaignManager.add(campaign1);
		campaignManager.update(campaign1, 0.20);
		campaignManager.delete(campaign1);
		
		System.out.println("-------------------------");

		GameManager gameManager = new GameManager();
		Game game1 = new Game(1, "Tom Clancy's Rainbow Six Siege", "FPS", 75);
		Game game2 = new Game(2, "League of Legends", "MOBA", 25);
		
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.sell(game1, gamer1);
		gameManager.sell(game2, gamer1, campaign1);
		
	}

}
