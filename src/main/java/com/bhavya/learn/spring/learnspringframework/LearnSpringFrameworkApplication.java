package com.bhavya.learn.spring.learnspringframework;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.bhavya.learn.spring.learnspringframework.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

//		SpringApplication.run(LearnSpringFrameworkApplication.class, args);

//		GameRunner class is now loosely coupled right, with the GamingConsole interface.
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
		PacMan game = new PacMan();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
