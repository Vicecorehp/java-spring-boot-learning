package com.hp.service.impl;

import com.hp.entity.Comment;
import com.hp.service.CommentService;

import java.util.List;

public class CommentServiceImpl implements CommentService {
    @Override
    public List<Comment> getComments() {
        return List.of();
    }

    @Override
    public Boolean addComment(Comment comment) {
        return null;
    }
}
