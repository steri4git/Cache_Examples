package de.steri.cache.ehcache;

import java.util.HashMap;
import java.util.Map;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

/**
 * Hello world!
 *
 */
public class EhCacheExample {
	
	private CacheManager cacheManager = CacheManager.newInstance("src/etc/ehcache.xml");

	public CacheManager getManager() {
		return cacheManager;
	}

	public void setManager(CacheManager manager) {
		this.cacheManager = manager;
	}
	
	public void testCache(){
	
		Cache cache = cacheManager.getCache("myCache1");
		String key = "1";
		String value = "EINS";
		Element cacheElement = new Element(key, value);
		cache.put(cacheElement);
		Element cacheEntry = cache.get(key);
		System.out.println(cacheEntry.getValue());
		System.out.println(cacheEntry.getHitCount());
	}
}
