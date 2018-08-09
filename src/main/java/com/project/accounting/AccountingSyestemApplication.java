package com.project.accounting;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountingSyestemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountingSyestemApplication.class, args);
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String dateStr = format.format(date);
		System.out.println(dateStr);
	}
}
