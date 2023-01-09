package com.maybank.smartweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
//@Controller
public class SmartwebApplication {

//	@RequestMapping("/")
//	@ResponseBody
//	public String index() {
//		return "<h2><b>Spring Hello World</b></h2>";
//	}

	public static void main(String[] args) {
		SpringApplication.run(SmartwebApplication.class, args);
	}

}
