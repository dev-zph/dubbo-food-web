import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zhangph
 * @version 2017-07-04 10:53
 **/
@EnableWebMvc
@EnableSwagger2
@Configuration
@ComponentScan(basePackages ="dubbo.out.food.controller")
public class MySwaggerConfig extends WebMvcConfigurationSupport {


    @Bean
    public Docket buildDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInf())
                .select()       .apis(RequestHandlerSelectors.basePackage("dubbo.out.food.controller"))//controller路径
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo buildApiInf(){
        return new ApiInfoBuilder()
                .title("Dubbo-WEB服务接口列表")
                .termsOfServiceUrl("")
                .description("WEB服务接口列表 Created By Zph")
                .contact(new Contact("zph", "no set", "1127518802@qq.com"))
                .build();

    }

}