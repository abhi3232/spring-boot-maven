package com.proginators.idp.setup;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:pro-idp-properties.properties")
@ConfigurationProperties
public class IDPConfig {
	private final Map<String, Object> configMap = new HashMap<>();
	
	public Map<String, Object> getConfigMap(){
		return this.configMap;
	}
}
