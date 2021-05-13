import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import address.customer.Cust;

class TestDriver {

	@Test
	void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Cust cust = (Cust) context.getBean("customer");
		assertAll(
		()->assertEquals(cust.getCname(),"Nikki"),
		()->assertEquals(cust.getCid(),1234),
		()->assertEquals(cust.getCcontact(),900000000L),
		()->assertEquals(cust.getCaddress().getStreet(),"street"),
		()->assertEquals(cust.getCaddress().getCity(),"plots"),
		()->assertEquals(cust.getCaddress().getZip(),522202),
		()->assertEquals(cust.getCaddress().getCountry(),"India")
	);
	}
}

