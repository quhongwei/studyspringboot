package hongwei.qu.springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * java -agentlib:jdwp=help
 *
 * java -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=8000 -jar target/studyspringboot-0.0.1-SNAPSHOT.war
 */
@SpringBootApplication
public class SpringbootwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootwebApplication.class, args);
	}

}
