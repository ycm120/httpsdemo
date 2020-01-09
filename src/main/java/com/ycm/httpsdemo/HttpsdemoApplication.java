package com.ycm.httpsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HttpsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpsdemoApplication.class, args);
	}

	@RestController
	@RequestMapping
	public class HelloController {


		@RequestMapping("/hello/{name}")
		public String hello(@PathVariable String name){
			return "hello: " + name;
		}
	}

}
