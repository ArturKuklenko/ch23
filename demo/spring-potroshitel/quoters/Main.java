package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("beans.xml");
		contex.getBean(TerminatorQuoter.class).sayQuote();
		/*while(true){
			Thread.sleep(1000);
		contex.getBean(TerminatorQuoter.class).sayQuote();
		}*/
	}

}
