package com.abcode.reddit.redditclone.repository;

import com.abcode.reddit.redditclone.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
