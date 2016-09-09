package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Bean bean = context.getBean(Bean.class);
		bean.setName("Bean");
		System.out.println(bean.getName());
	}

}
