package org.katana.gradle.common;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import testcategories.IntegrationTest;

@Category(IntegrationTest.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class CommonApplicationTests {

	@Test
	public void contextLoads() {
	}
}
