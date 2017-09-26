package mokitoTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "applicationtestContext.xml" })

/*@RunWith(MockitoJUnitRunner.class)*/
public class mokitoExample {
	
/*@Autowire
SubscriptionQueryService  test;
*/
	/*@Mock
	SubscriptionQueryService  sqs;

	@Test
	public void mockFindAccountsByTypeAndRename(){
        List<Account> name = new ArrayList<Account>();
        Account acc1 = new Account();
        acc1.setDisplayName("test");
        name.add(acc1);
       // name.add(test);
        
        Mockito.when(sqs.findAccountsByTypeAndRename("test")).thenReturn(name);
        assertEquals(sqs.findAccountsByTypeAndRename("test"),name);
        
    }
	*/
	@Autowired
	UserEventServiceImpl userevent;
	
	@Test
    public void testFindAccountsByTypeAndRename() 
	{
		//UserEventServiceImpl userevent = new UserEventServiceImpl();
		Collection<Account> account= new ArrayList<Account>();
		
		String test1 = null;
		
		account = userevent.findAccountsByTypeAndRename(test1);
		
		List<Account> returnObj = new ArrayList<Account>(account);
		
		if(null != returnObj){
			for(Account acccc : returnObj){
				System.out.println(acccc.getDisplayName());
			}
		}
		

    }


}
