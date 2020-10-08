package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;

@Controller("/hello-world")
public class HelloController {

    @Get
    public Flowable<String> helloWorld() {
        return Flowable.empty();
    }

}
