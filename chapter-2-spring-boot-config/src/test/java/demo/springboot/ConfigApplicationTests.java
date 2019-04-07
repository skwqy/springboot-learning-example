package demo.springboot;

import demo.springboot.config.BookComponent;
import demo.springboot.config.BookProperties;
import demo.springboot.config.UserProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigApplicationTests {
	private static final Logger LOGGER = LoggerFactory.getLogger(ConfigApplicationTests.class);
	@Autowired
	BookProperties bookProperties;

	@Autowired
	BookComponent bookComponent;

	@Autowired
	UserProperties userProperties;

	@Test
	public void testBookProperties() {
		Assert.assertEquals(bookProperties.getName(),"《Spring Boot 2.x 核心技术实战 - 上 基础篇》From YMAL");
		Assert.assertEquals(bookProperties.getWriter(),"泥瓦匠BYSocket From YMAL");
	}

	@Test
	public void testBookComponent() {
		Assert.assertEquals(bookComponent.getName(),"《Spring Boot 2.x 核心技术实战 - 上 基础篇》From YMAL");
		Assert.assertEquals(bookComponent.getWriter(),"泥瓦匠BYSocket From YMAL");
	}

	@Test
	public void randomTestUser() {
		LOGGER.info("\n\n" + userProperties.toString() + "\n");
	}
}
