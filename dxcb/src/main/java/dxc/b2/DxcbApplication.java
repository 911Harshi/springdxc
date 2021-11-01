package dxc.b2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DxcbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DxcbApplication.class, args);


		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(10000);

				ApplicationContext vehiclesFactory = new ClassPathXmlApplicationContext("settingsconfig.xml");
				Vehicle vehicle = (Vehicle) vehiclesFactory.getBean("car"); 
				//Car car = new Car();
				vehicle.drive();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
