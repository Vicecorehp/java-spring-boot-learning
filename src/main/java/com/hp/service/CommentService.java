package com.hp.service;

import com.hp.entity.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {
    List<Comment> getComments();

    Boolean addComment(Comment comment);
}
