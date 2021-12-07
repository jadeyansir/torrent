package com.torrent.zuel.recruitment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 启动类
 */
@EnableSwagger2
@SpringBootApplication
public class ZuelRecruitmentApplication {

    /**
     * 主方法
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        SpringApplication.run(ZuelRecruitmentApplication.class, args);
    }

}
