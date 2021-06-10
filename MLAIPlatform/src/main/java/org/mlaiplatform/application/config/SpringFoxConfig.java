package org.mlaiplatform.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(PathSelectors.any()).build();
	}
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("AIMLPlatform API")
				.description("AIMLPlatform API reference for developers")
				.termsOfServiceUrl("https://github.com/ramanaiahpirla")
				.contact("ramanaiah.237@gmail.com").license("github License")
				.licenseUrl("ramanaiah.237@gmail.com").version("1.0").build();
	}

}
