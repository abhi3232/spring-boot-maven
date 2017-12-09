/*package com.proginators.idp.server.config;

import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.mappers.VendorExtensionsMapperImpl;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket getDocket(){
		Docket docket = new Docket(DocumentationType.SWAGGER_2);
		docket.select().apis(RequestHandlerSelectors.basePackage("com.proginators.idp")).build();
		return docket;
	}
	
	private ApiInfo metaData() {
		ApiInfo apiInfo = new ApiInfo(
                "Spring Boot REST API",
                "Spring Boot REST API for Online Store",
                "1.0",
                "Terms of service",
                new Contact("John Thompson", "https://springframework.guru/about/", "john@springfrmework.guru"),
               "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0", (Collection<VendorExtension>) new VendorExtensionsMapperImpl());
        return apiInfo;
	}
	
	
}
*/