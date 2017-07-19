package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AutowiredConstructorClass {

	private static final Logger log = LoggerFactory.getLogger(AutowiredConstructorClass.class);

	Environment env;
	private final String scheulerInterval;

	@Autowired
	public AutowiredConstructorClass(Environment env) {
		this.env = env;
		this.scheulerInterval = this.env.getProperty("sheduler.interval.millis");

		log.info("autowired constructor: " + this.scheulerInterval);
	}

}