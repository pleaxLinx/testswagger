package org.kgc.testswagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestHeader;
import springfox.documentation.builders.RequestHandlerSelectors;


import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket getDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.any()).build();
    }

    public ApiInfo apiInfo(){
        List<VendorExtension> list = new ArrayList<>();
        list.add(new VendorExtension() {
            @Override
            public String getName() {
                return null;
            }

            @Override
            public Object getValue() {
                return null;
            }
        });
        Contact contact = new Contact("Aplex","http://www.baidu.com","2488258398@qq.com");
       return new ApiInfo("SwaggerTest",
               "Aplex Document", "V1.0",
               "http://www.baidu.com",
               new Contact("Aplex","http://www.baidu.com","2488258398@qq.com"),
               "Apache 2.0",
               "http://www.apache.org/licenses/LICENSE-2.0",list);
    }
}
