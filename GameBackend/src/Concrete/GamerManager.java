package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	private GamerCheckService checkService;
	
	public GamerManager(GamerCheckService checkService) {
		this.checkService = checkService;
	}
	
	@Override
	public void register(Gamer gamer) {
		if(checkService.checkIfRealPerson(gamer))
			System.out.println("Has been registered to the system : " + gamer.getFirstName() + " " + gamer.getLastName() + "\n");
		else
			System.out.println("Not a valid person!\n");
	}

	@Override
	public void updateInfo(Gamer gamer) {
		System.out.println("Your profile has been saved!\n");
	}

	@Override
	public void deleteRegistration(Gamer gamer) {
		System.out.println("The gamer has been deleted from the system:" + "\nName: " + gamer.getFirstName() + " " + gamer.getLastName() + "\n");
	}

}
