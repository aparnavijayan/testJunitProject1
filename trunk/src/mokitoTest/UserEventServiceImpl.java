package mokitoTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

public class UserEventServiceImpl implements SubscriptionQueryService {

	@Resource
	private SubscriptionQueryService accountQueryService;


	public Collection<Account> findAccountsByTypeAndRename(String test) {
		final Collection<Account> accountsByType = this.accountQueryService
				.findAccountsByType(test);

		// complex logic
		for (Account a : accountsByType) {
			a.setDisplayName("Apala");
		}

		return accountsByType;
	}


	@Override
	public Collection<Account> findAccountsByType(String type) {
		Account acc = new Account();
		acc.setDisplayName("Test123");
		List<Account> reply = new ArrayList<Account>();
		reply.add(acc);
		return reply;
	}
}
