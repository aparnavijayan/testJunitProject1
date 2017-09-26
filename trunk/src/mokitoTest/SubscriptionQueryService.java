package mokitoTest;

import java.util.Collection;

public interface SubscriptionQueryService {

	Collection<Account> findAccountsByType(String type);
	Collection<Account>  findAccountsByTypeAndRename(String test);

}
