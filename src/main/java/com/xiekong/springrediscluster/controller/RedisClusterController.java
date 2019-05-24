package com.xiekong.springrediscluster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XieKong
 * @date 2019/5/17 12:56
 */
@RestController
@RequestMapping("/redis")
public class RedisClusterController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/get")
    public Object getData() {
        return stringRedisTemplate.opsForValue().get("key111");
    }

    @PostMapping("/set")
    public void setData() {
        stringRedisTemplate.opsForValue().set("key111", "cscscscscs");
    }
}
