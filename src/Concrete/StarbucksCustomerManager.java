package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(final CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(final Customer customer) throws Exception {
		if (!customerCheckService.CheckIfRealPerson(customer))
			throw new Exception("Not a valid person");
		super.Save(customer);
	}

}
