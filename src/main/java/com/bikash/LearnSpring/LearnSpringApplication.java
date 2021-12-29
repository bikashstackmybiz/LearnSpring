package com.bikash.LearnSpring;

import com.bikash.LearnSpring.game.GameRunner;
import com.bikash.LearnSpring.game.MarioGame;
import com.bikash.LearnSpring.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
//		MarioGame game = new MarioGame();
//		SuperContraGame game1 = new SuperContraGame();
//		GameRunner runner = new GameRunner(game);
		runner.runGame();
	}

}
