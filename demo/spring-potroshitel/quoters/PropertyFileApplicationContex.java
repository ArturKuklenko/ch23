package quoters;

import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class PropertyFileApplicationContex extends GenericApplicationContext{

	public PropertyFileApplicationContex(String fileName) {
		PropertiesBeanDefinitionReader reader = new PropertiesBeanDefinitionReader(this);
		int i = reader.loadBeanDefinitions(fileName);
		System.out.println("found "+i+" beans");
		refresh();
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		PropertyFileApplicationContex context = new PropertyFileApplicationContex("context.properties");
		context.getBean(Quoter.class).sayQuote();
	}
}
