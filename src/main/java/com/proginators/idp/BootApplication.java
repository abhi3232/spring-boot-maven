package com.proginators.idp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootApplication {
	
	public static void main(String args[]){
		System.out.println(SpringApplication.run(BootApplication.class, args)
                .getBean(Test.class).getInfo());
	}
	
	@Bean
    @ConfigurationProperties
    public Test test() {
        return new Test();
    }

    public static class Test {
        private Map<String, String> info = new HashMap<>();

        public Map<String, String> getInfo() {
            return this.info;
        }
    }

}
