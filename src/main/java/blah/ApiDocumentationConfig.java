package blah;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@ComponentScan(basePackages = ApiDocumentationConfig.BASE_PACKAGE)
public class ApiDocumentationConfig {

    public static final String BASE_PACKAGE = "blah";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .build()
                .forCodeGeneration(true);
    }

}