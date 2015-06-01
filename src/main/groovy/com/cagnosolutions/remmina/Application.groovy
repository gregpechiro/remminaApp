package com.cagnosolutions.remmina
import groovy.transform.CompileStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
/**
 * Created by Scott Cagno.
 * Copyright Cagno Solutions. All rights reserved.
 */

@CompileStatic
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
	static void main(String... args) {
		SpringApplication.run Application, args
	}
}