package com.abcode.reddit.redditclone.repository;

import com.abcode.reddit.redditclone.model.Post;
import com.abcode.reddit.redditclone.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
}
