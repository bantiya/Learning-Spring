package com.bhavya.learn.spring.learnspringframework;

import com.bhavya.learn.spring.learnspringframework.enterprise.example.web.MyWebController;
import com.bhavya.learn.spring.learnspringframework.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
// @SpringBootApplication has a @ComponentScan("..."), which scans for all the @Component in the base package
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

//		Creating a Spring Context `context` to manage all our beans
// 		GamingConsole game = new PacMan(); // 1
//		GameRunner runner = new GameRunner(game); // 2
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);



		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
