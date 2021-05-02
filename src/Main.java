import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(final String[] args) throws Exception {

		final BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		// new StarbucksCustomerManager(new CustomerCheckManager());
		// new NeroCustomerManager();

		final Customer customer = new Customer(1, "Ahmet", "Çetinkaya", new Date(1999, 8, 11), "11111111111");

		customerManager.Save(customer);

	}

}
