package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

public class MainApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = SpringApplication.run(AppConfig.class, args);
	}
}
