package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
    @GetMapping(path = "/hello") // http://localhost:8080/api/get/hello
    public String hello() {
        return "get Hello";
    }
    // 예전에는 다음과 같이 @RequestMapping을 GetMapping와 똑같이 사용했지만 이렇게 사용하게 되면
    // get / post / put / delete 모든 메소드가 동작하게 된다.
    // @RequestMapping("/hi")
    // public String hi() {

    // 그러므로 @RequestMapping을 사용할 때는 내가 어떤 메소드를 사용할지 설정을 해줘야 한다.
    // 그럼 get메소드를 사용해 보겠다. 다음과 같이 위에 코드와 비교를 해보면 get메소드를 따로 설정해준걸 볼수있다.
    // 이와같이 설정하면 속성에 get메소드만 지정이 되고 주소는 http://localhost:8080/api/get/hi로 동작하게 된다.
    // 예전에 사용된 주소매핑 코드인 아래와 같은 코드 path와 method를 합친게 위에 있는 @GetMapping과 같다.
    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    public String hi() {
        return "hi";
    }

    // http://localhost:8080/api/get/path-variable/{name}
    // 변수를 사용할 때는 변수의 이름과 @GetMapping 주소 {}안의 이름이 동일해야 한다.
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable String name) {
        System.out.println("PathVariable : " + name);
        return name;

    }

}
