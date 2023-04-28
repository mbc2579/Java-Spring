package com.example.post.controller;

import com.example.post.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {
    @PostMapping("/post")
    // GetMapping일때는 Map앞에 @RequestParam을 붙여줬는데 PostMapping는 Map앞에 @RequestBody를 붙여준다.
    // 이유는 http에 요청을 보낼 때 body에 데이터를 심어 보내주기 때문이다.
    public void post(@RequestBody Map<String, Object> requestData) {
        requestData.forEach((key, value) -> {
            System.out.println("key : " + key);
            System.out.println("value : " + value);
        });
    }

    @PostMapping("/post2")
    public void post(@RequestBody PostRequestDto requestData) {
        System.out.println(requestData);
    }

}
