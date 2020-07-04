package com.sunny;

import com.sunny.bo.Userinfos;
import com.sunny.service.SendMsgService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SendmsgApplicationTests {
	@Autowired
	private SendMsgService sendMsgService;
	@Test
	public void contextLoads() throws Exception {
		Userinfos us=new Userinfos(1,"zhangsan","123",new Date(),1);
		sendMsgService.sendMsg(us);
	}

}
