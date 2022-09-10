package com.ocr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class ImgOcrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImgOcrApplication.class, args);
	}

}
