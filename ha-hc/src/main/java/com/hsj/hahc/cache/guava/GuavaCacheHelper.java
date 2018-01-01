package com.hsj.hahc.cache.guava;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by au on 2017/10/29.
 */
public class GuavaCacheHelper {
    private static Logger logger = LoggerFactory.getLogger(GuavaCacheHelper.class);

    public static void main(String[] args) {
        LoadingCache<String, Integer> cacheLoader = CacheBuilder.newBuilder().expireAfterAccess(10, TimeUnit.DAYS)
                .build(new CacheLoader<String, Integer>() {
                    @Override
                    public Integer load(String s) throws Exception {
                        return null;
                    }
                });


    }


}
