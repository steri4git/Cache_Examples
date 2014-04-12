package de.steri.cache.spring;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

public class Product {
	@CacheEvict(value = "myCache1", allEntries = true)
	public void setProduct(int productId) {
		System.out.println("execute setProduct method..");
	}

	@Cacheable("myCache1")
	public String getProduct(int productId) {
		System.out.println("execute getProduct method..");
		if (productId == 1) {
			return "Product A";
		} else {
			return "Product B";
		}
	}
}

