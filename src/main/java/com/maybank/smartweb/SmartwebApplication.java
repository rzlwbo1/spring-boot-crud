package com.maybank.smartweb;

import com.maybank.smartweb.entity.Car;
import com.maybank.smartweb.entity.Employee;
import com.maybank.smartweb.repository.CarRepo;
import com.maybank.smartweb.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Controller
public class SmartwebApplication implements ApplicationRunner {

//	@RequestMapping("/")
//	@ResponseBody
//	public String index() {
//		return "<h2><b>Spring Hello World</b></h2>";
//	}

	@Autowired
	private EmployeeRepo employeeRepo;
	@Autowired
	private CarRepo carRepo;

	public static void main(String[] args) {
		SpringApplication.run(SmartwebApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
//		System.out.println("init Application");

		Employee employee = new Employee();
		employee.setFirstName("Adam");
		employee.setLastName("Hawa");
		employee.setContact("1902312");
		employee.setAddress("Surga");
//
//
//		Car car = new Car();
//		car.setPabrikan("Honda Jazz");
//		car.setType("Matic");
//		car.setColor("Blue");
//		car.setPrice(100000.0);
//
//		this.carRepo.save(car);
		this.employeeRepo.save(employee);

	}
}
