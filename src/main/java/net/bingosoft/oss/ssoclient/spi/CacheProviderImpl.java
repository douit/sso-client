/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package net.bingosoft.oss.ssoclient.spi;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * {@link CacheProvider}的简单默认实现.
 */
public class CacheProviderImpl implements CacheProvider {

    protected final Map<String,Object> map = new ConcurrentHashMap<String, Object>();
    
    @Override
    public <T> T get(String key) {
        return (T)map.get(key);
    }

    @Override
    public void put(String key, Object item, long expires) {
        map.put(key,item);
    }

    @Override
    public void remove(String key) {
        map.remove(key);
    }

}
