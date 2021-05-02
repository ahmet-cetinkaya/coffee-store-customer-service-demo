package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(final Customer customer) throws Exception {
		System.out.println("Saved to db : " + customer.getFirstName());
	}

}
