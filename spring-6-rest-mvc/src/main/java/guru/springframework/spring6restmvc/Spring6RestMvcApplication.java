package guru.springframework.spring6restmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:db.properties")
public class Spring6RestMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring6RestMvcApplication.class, args);
    }

}
