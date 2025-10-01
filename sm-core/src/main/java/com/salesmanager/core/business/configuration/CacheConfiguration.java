package com.salesmanager.core.business.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Cache configuration for Spring Boot 3.x with EhCache 3.x (JSR-107)
 * 
 * This replaces the legacy XML-based EhCache 2.x configuration.
 * The actual cache configuration is now in ehcache.xml using EhCache 3.x format.
 */
@Configuration
@EnableCaching
public class CacheConfiguration {
    
    @Autowired
    private CacheManager cacheManager;
    
    /**
     * Expose the service cache bean for autowiring
     */
    @Bean(name = "serviceCache")
    public Cache serviceCache() {
        return cacheManager.getCache("com.shopizer.OBJECT_CACHE");
    }
}
