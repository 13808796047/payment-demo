package com.example.paymentdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author Summer
 * @date 2022/3/29 10:49
 */
@Configuration
@EnableOpenApi
public class Swagger {
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.OAS_30)
                .groupName("前台API")
                .apiInfo(apiInfo())
                .select()
                .paths(PathSelectors.regex("/api/.*"))
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("前台-API文档")
                .description("本文档描述了前台微服务接口定义")
                .version("1.0")
                .contact(new Contact("Summer", "http://summer.com",
                        "511391805@qq.com"))
                .build();
    }
}
