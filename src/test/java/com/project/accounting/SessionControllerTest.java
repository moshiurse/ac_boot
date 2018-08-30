package com.project.accounting;

import org.aspectj.lang.annotation.Before;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties.Jedis;
import org.springframework.boot.test.web.client.TestRestTemplate;

public class SessionControllerTest {
	
	private Jedis jedis;
	private TestRestTemplate testRestTemplate;
	private TestRestTemplate testRestTemplateWithAuth;
	
	private String testUrl = "http://localhost:8080/";
	
	@Before(value="")
	public void clearRedisdata() {
		
		testRestTemplate = new TestRestTemplate();
        testRestTemplateWithAuth = new TestRestTemplate("admin", "password", null);
 
        jedis = new Jedis();
        jedis.notifyAll();
	}

}
