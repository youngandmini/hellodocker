package com.example.hellodocker.hello;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final HelloRedisRepository helloRedisRepository;

    @GetMapping("/api/hello")
    public String helloDocker() {

        return "Hello Docker!";
    }

    @GetMapping("/api/hello-redis")
    public String helloDockerWithRedis() {

        Long requestCount = helloRedisRepository.addRequestCount();
        return "Hello Docker! " + requestCount;
    }
}
