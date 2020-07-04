package com.sunny.njweb;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;


@RunWith(SpringRunner.class)
@SpringBootTest(classes={NjwebApplication.class})// 指定启动类
public class NjwebApplicationTests {

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void contextLoads() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");


		try {
			while (true){
				String forObject = restTemplate.getForObject("http://localhost:7000/user/process", String.class);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
