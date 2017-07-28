package screensaver;

import java.awt.Color;
import java.util.Random;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "screensaver")
public class Config {
	@Bean
	@Scope("periodical")
	public Color color(){
		Random random = new Random();
		return new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));	
	}
	@SuppressWarnings("serial")
	@Bean
	public ColorFrame frame(){
		return new ColorFrame(){
			@Override
			protected Color getColor() {	
				return color();
			}
			
		};
	}
	public static void main(String[] args) throws InterruptedException{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(Config.class);
		while(true){
			contex.getBean(ColorFrame.class).showOnRandomPlace();
			Thread.sleep(100);
		}
	}
}
