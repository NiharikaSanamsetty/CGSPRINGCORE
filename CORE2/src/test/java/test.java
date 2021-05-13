import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.collections.ListSet;

class QuestionsTestMain {

	@Test
	void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Questions.xml");
		ListSet lsm = (ListSet) context.getBean("listsetmap");
		assertAll(
				()->assertEquals(lsm.getList(),"What Abot you?"),
				()->assertEquals(lsm.getSet(),45)
			);
	}

}
