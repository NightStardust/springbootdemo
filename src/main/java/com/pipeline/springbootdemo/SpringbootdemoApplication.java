package com.pipeline.springbootdemo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.RequestWrapper;

@RestController
@SpringBootApplication
public class SpringbootdemoApplication {

	@RequestMapping("/")
	public static String index(){
		return "hello,this is a sample springboot!";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

}
