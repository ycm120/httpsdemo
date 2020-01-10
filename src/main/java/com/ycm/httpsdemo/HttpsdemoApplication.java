package com.ycm.httpsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
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

		@RequestMapping("/hello/auth")
		public Authentication hello2(Authentication authentication){
			return authentication;
		}

		@RequestMapping("/hello/userDetail")
		public UserDetails hello3(@AuthenticationPrincipal UserDetails userDetails){
			return userDetails;
		}
	}

}
