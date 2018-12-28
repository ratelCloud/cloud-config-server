package com.ratel.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
* 类说明
* <p>
* @author niexiang
* @version  1.0.0
* @date 2018/12/28
*/
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}

}

