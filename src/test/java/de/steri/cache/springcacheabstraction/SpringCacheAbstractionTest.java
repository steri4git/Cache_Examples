package de.steri.cache.springcacheabstraction;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.steri.cache.spring.Product;

@ContextConfiguration(locations = { "classpath:application-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringCacheAbstractionTest extends TestCase {
	
	@Autowired
	Product product;

	@Test
	public void testCache() {
		
		for (int i = 0; i < 10; i++) {
			product.getProduct(1);
			
		}
	}
}
