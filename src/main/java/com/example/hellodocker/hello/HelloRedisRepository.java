package com.example.hellodocker.hello;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class HelloRedisRepository {

    private final RedisTemplate<String, String> redisTemplate;

    public Long addRequestCount() {

        return redisTemplate.opsForValue().increment("hello_count");
    }

}
