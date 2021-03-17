package com.cricket.game;

import com.cricket.game.service.helper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) {

		helper help = new helper();
		help.doHelp();
		SpringApplication.run(GameApplication.class, args);


	}

}
