package com.salesmanager.core.business.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

import com.salesmanager.core.model.merchant.MerchantStore;

@Component("cache")
public class CacheUtils {
	
	
    @Autowired
    @Qualifier("serviceCache")
    private Cache cache;
    
    @Autowired
    private CacheManager cacheManager;
	
	
	public final static String REFERENCE_CACHE = "REF";
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CacheUtils.class);

	private final static String KEY_DELIMITER = "_";
	


	public void putInCache(Object object, String keyName) throws Exception {

		cache.put(keyName, object);
		
	}
	

	public Object getFromCache(String keyName) throws Exception {

		ValueWrapper vw = cache.get(keyName);
		if(vw!=null) {
			return vw.get();
		}
		
		return null;
		
	}
	
	public List<String> getCacheKeys(MerchantStore store) throws Exception {
		
		// EhCache 3.x (JSR-107) doesn't provide a direct way to list all keys
		// This is a limitation compared to EhCache 2.x
		// For now, return an empty list - functionality needs to be reimplemented if critical
		LOGGER.warn("getCacheKeys is not fully supported with EhCache 3.x - returning empty list");
		return new ArrayList<String>();
	}
	
	public void shutDownCache() throws Exception {
		// Cache shutdown is handled by Spring Boot's lifecycle management
	}
	
	public void removeFromCache(String keyName) throws Exception {
		cache.evict(keyName);
	}
	
	public void removeAllFromCache(MerchantStore store) throws Exception {
		// With EhCache 3.x, we can clear the entire cache
		// but selective removal based on store requires reimplementation
		LOGGER.warn("removeAllFromCache for specific store not fully supported with EhCache 3.x - clearing entire cache");
		cache.clear();
	}
	


}
