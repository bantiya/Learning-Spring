package com.bhavya.learn.spring.learnspringframework;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.bhavya.learn.spring.learnspringframework.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

//		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		MarioGame game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
