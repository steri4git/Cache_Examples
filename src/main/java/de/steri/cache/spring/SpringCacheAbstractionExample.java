package de.steri.cache.spring;

import java.util.HashMap;
import java.util.Map;

import org.springframework.cache.annotation.Cacheable;

import net.sf.ehcache.CacheManager;

/**
 * Hello world!
 *
 */
public class SpringCacheAbstractionExample {
	
	public void testCache() {
		
	}

	@Cacheable(value={"myCache1"})
	public String cachableMethod(String key){
		return "EINS";
		
	}
}
