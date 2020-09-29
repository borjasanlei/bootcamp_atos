package myIoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Employee Juan=context.getBean("myEmployee", Employee.class);
		
		System.out.println(Juan.getTasks());
		
		context.close();
			
	}

}
