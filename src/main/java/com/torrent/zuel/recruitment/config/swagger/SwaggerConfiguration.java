package com.torrent.zuel.recruitment.config.swagger;

import com.fasterxml.classmate.TypeResolver;
import com.torrent.zuel.recruitment.model.dto.request.PositionRequestDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import javax.annotation.Resource;

/**
 * swagger 配置
 *
 * @author yan
 * @date 2021/11/14
 */
@Configuration
public class SwaggerConfiguration {

    @Resource
    private TypeResolver typeResolver;

    /**
     * 解析类型
     *
     * @return docket
     */
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .additionalModels(typeResolver.resolve(PositionRequestDTO.class));
    }

}