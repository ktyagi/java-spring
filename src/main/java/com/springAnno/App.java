package com.springAnno;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Samsung s7= context.getBean(Samsung.class);
				s7.config();
/*		Snapdragon sd= (Snapdragon) context.getBean("snap");
		sd.process();*/
	}
}


//https://youtu.be/5zUTc-kge8I

//https://www.youtube.com/watch?v=_1KEBiGtfqE

/*
import org.junit.Test;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;

*/
/**
 * Created by Kuldeep.Kumar on 19/01/2017.
 *//*


public class TestClass {
	@Test
	public void test1(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.close();
		driver.quit();
	}
}
*/
