package com.proginators.idp.resource;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proginators.idp.setup.IDPConfig;

@RestController
public class IDPResource {
	
	@Autowired
	private IDPConfig idpConfig;

	@RequestMapping(method=RequestMethod.GET,value="/getConf")
	@ResponseBody
	public Map<String, Object> getConfiguration(){
		return idpConfig.getConfigMap();
	}
}
