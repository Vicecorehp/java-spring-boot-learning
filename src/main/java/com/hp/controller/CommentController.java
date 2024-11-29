package com.hp.controller;

import com.hp.entity.Comment;
import com.hp.entity.Result;
import com.hp.entity.Status;
import com.hp.service.CommentService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/comment")
public class CommentController {

    @Resource
    private CommentService commentService;

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @PostMapping
    public Result<Comment> comment(@RequestBody Comment comment) {
        Result<Comment> result = Result.buildResult(Status.ERROR);
        if (comment == null || comment.getContent() == null) {
            return result;
        }
        return Result.buildResult(Status.OK);
    }

    @GetMapping
    public Result<List<Comment>> commentList() {
        Result<List<Comment>> result = Result.buildResult(Status.ERROR);
        var comments = commentService.getComments();
        var optionalCommentList = Optional.ofNullable(comments);
        if (optionalCommentList.isPresent()) {
            var commentList = optionalCommentList.get();
            result = Result.buildResult(Status.OK, commentList);
        }
        return result;
    }
}
