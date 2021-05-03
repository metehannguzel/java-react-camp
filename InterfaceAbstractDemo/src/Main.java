import Abstract.BaseCustomerManager;
import Concrete.StarbucksCustomerManager;
import Concrete.NeroCustomerManager;
import Adapters.MernisServiceAdapter;
import Entities.Customer;

public class Main {
	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Metehan Kürşat", "Güzel", 2000, "00000000000"));	
		
	}
}
