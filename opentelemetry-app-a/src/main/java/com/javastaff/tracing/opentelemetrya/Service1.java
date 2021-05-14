package com.javastaff.tracing.opentelemetrya;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Service1 {
	@Autowired
    private RestTemplate restTemplate;
	
    @Value("${opentelemetry.b.baseurl}")
    private String bBaseUrl;

	public void hello() {
		HttpHeaders headers = new HttpHeaders();
    	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    	HttpEntity<String> entity = new HttpEntity<>(headers);
    	restTemplate.exchange(bBaseUrl + "/service", HttpMethod.GET, entity, String.class).getBody();	
	}
}
