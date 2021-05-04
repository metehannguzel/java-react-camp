package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService {
	@Override
	public void add(Game game) {
		System.out.println("The following game has been added:" + "\nName: " + game.getName() + "\n");
	}
	
	@Override
	public void delete(Game game) {
		System.out.println("The following game has been deleted:" + "\nName: " + game.getName() + "\n");
	}

	@Override
	public void sell(Game game, Gamer gamer) {
		System.out.println("The following game has been sold to the customer: " + "\nGame name: " + game.getName() +
				"\nPrice: " + game.getPrice() +
				"\nCustomer name: " + gamer.getFirstName() + " " + gamer.getLastName() + "\n");
	}

	@Override
	public void sell(Game game, Gamer gamer, Campaign campaign) {
		System.out.println("The following discounted game has been sold to the customer: " + "\nGame name: " + game.getName() +
				"\nPrice: " + game.getPrice() + "\nDiscounted price: " + (game.getPrice() - (game.getPrice() * campaign.getDiscountRate())) +
				"\nCustomer name: " + gamer.getFirstName() + " " + gamer.getLastName() + "\n");
	}
	
}
