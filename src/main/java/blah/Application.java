package blah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Import(ApiDocumentationConfig.class)
public class Application {

    public static void main(String[] args) {
        System.setProperty("server.servlet.context-path", "/api");

        SpringApplication.run(Application.class, args);
    }
}
