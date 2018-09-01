package com.yuxin.config.swagger;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * swagger-ui 配置类
 * @author wgq
 * 2018-1-3 11:45:51
 */
@Configuration
@EnableSwagger
@EnableWebMvc
public class SwaggerConfig {
	
	private SpringSwaggerConfig springSwaggerConfig;

	@Autowired
    public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
        this.springSwaggerConfig = springSwaggerConfig;
    }

    @Bean
    public SwaggerSpringMvcPlugin customImplementation(){
           return new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
                    .apiInfo(apiInfo())
                    .includePatterns(".*/(magic).*");
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
        		"基因魔方APPAPI",
                "提供基因魔方App所有Restful接口",
                "www.flyeast.top",
                "MrWGQ@163.com",
                "β客栈", 
                "www.flyeast.top");
        return apiInfo;
    }


}
