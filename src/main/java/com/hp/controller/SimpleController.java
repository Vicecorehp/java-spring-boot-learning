package com.hp.controller;

import com.hp.entity.Comment;
import com.hp.entity.Result;
import com.hp.entity.Status;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class SimpleController {
    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("comment")
    public Result comment(@RequestBody Comment comment) {
        if (comment == null) {
            return Result.buildResult(Status.ERROR);
        }
        return Result.buildResult(Status.OK);
    }
}
