package Adapters;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {
	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoap mernisService = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = mernisService.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(), gamer.getYearOfBirth());
		} catch (Exception ex) {
			System.out.println("Not a valid person!");
		}
		return result;
	}
	
}
