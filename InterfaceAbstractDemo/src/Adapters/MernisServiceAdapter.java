package Adapters;

import java.rmi.RemoteException;
import java.util.Date;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap mernisService = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result =  mernisService.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		}
		return result;
	}
	
}
