package address.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Cust customer = (Cust) context.getBean("customer");
		customer.cust();
		Add address = (Add) context.getBean("address");
		address.add();

	}

}
