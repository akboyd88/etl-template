package xyz.andrewkboyd.etltemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the spring boot application
 */
@SpringBootApplication
public class EtlTemplateApplication {

	private static final Logger LOG = LoggerFactory.getLogger(EtlTemplateApplication.class);

	/**
	 * Launch the spring application
	 * @param args passed to SpringApplication.run
	 */
	public static void main(String[] args) {
		try {
			SpringApplication.run(EtlTemplateApplication.class, args);
		} catch(Exception e) {
			LOG.error("Error: ", e);
		}
	}

}
