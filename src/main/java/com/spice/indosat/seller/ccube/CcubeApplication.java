package com.spice.indosat.seller.ccube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CcubeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CcubeApplication.class, args);
	}
	
	@Bean
    public Docket api() {
                    return new Docket(DocumentationType.SWAGGER_2).select()
                                                    .apis(RequestHandlerSelectors.any())
                                                    .paths(PathSelectors.any()).build().apiInfo(apiInfo());
    }
	private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Code cubes api").description("Spring REST API's for Seller app")
                .termsOfServiceUrl("localhost:8080")
                .contact("Code cubes").version("2.0").build();
    }
}
