package com.abcode.reddit.redditclone.repository;

import com.abcode.reddit.redditclone.model.Post;
import com.abcode.reddit.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
