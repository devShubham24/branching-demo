package com.sb.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.CommandLinePropertySource;
import org.yaml.snakeyaml.comments.CommentLine;

import com.sb.main.demo.demo1;

@SpringBootApplication
public class DemogitApplication  implements CommandLineRunner {
	@Autowired
	demo1   d;

	public static void main(String[] args) {
		SpringApplication.run(DemogitApplication.class, args);
//		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		d.run();
	}

}
