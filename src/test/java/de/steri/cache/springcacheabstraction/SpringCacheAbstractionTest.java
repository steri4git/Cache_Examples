package de.steri.cache.springcacheabstraction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.TestCase;

@ContextConfiguration(locations = { "/application-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringCacheAbstractionTest extends TestCase {

	@Test
	public void testCache() {

	}
}
