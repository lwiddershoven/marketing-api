package nl.leonw.springmicrodemo.marketingapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"spring.cloud.vault.token=123"})
class MarketingApiApplicationTests {

	@Test
	void contextLoads() {
	}

}
