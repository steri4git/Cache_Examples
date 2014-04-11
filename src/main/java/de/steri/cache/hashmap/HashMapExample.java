package de.steri.cache.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import net.sf.ehcache.CacheManager;

/**
 * 
 *
 */
public class HashMapExample {
	
	private Map map = new ConcurrentHashMap<String, String>();
	
	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}
	
	public void testCache() {
		map.put("1", "EINS");
		System.out.println(map.get("1"));
	}
}
