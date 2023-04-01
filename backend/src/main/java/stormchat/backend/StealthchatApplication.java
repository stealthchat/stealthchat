package stormchat.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;

@SpringBootApplication()
public class StealthchatApplication {

    public final static String API_VERSION = "v1";
    public final static String API_BASE_URL = "/api/" + API_VERSION;
    public static void main(String[] args) {
        SpringApplication.run(StealthchatApplication.class, args);
    }

    @Bean
    public PersistenceAnnotationBeanPostProcessor persistenceBeanPostProcessor() {
        return new PersistenceAnnotationBeanPostProcessor();
    }

}
