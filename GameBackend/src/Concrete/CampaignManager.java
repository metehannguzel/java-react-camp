package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
	@Override
	public void add(Campaign campaign) {
		System.out.println("The following campaign has been added:" + "\nCampaign code: " + campaign.getCode() +
				"\nCampaign name: " + campaign.getName() +
				"\nCampaign discount rate: " + campaign.getDiscountRate() + "\n");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("The following campaign has been deleted:" + "\nCampaign code: " + campaign.getCode() +
				"\nCampaign name: " + campaign.getName() +
				"\nCampaign discount rate: " + campaign.getDiscountRate() + "\n");
	}

	@Override
	public void update(Campaign campaign, double rate) {
		campaign.setDiscountRate(rate);
		System.out.println("The new discount rate for the campaign has been set to: %" + (rate * 100) + "\n");
	}

}
