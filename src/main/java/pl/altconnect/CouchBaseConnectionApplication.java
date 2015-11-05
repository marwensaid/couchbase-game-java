package pl.altconnect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@EnableAutoConfiguration
@ComponentScan("pl.test-sample")
@Configuration
public class CouchBaseConnectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(CouchBaseConnectionApplication.class, args);
    }
}
