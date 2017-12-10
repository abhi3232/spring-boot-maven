package com.proginators.idp.setup;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Abhijeet
 *
 */
@Component
@EnableConfigurationProperties
@ConfigurationProperties
@PropertySource("classpath:pro-idp-properties.properties")
public class IDPConfig {
	private  final Map<String, String> configMap = new HashMap<>();

	public Map<String, String> getConfigMap() {
		return configMap;
	}
}
