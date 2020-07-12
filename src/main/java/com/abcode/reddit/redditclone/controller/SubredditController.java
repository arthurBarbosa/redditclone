package com.abcode.reddit.redditclone.controller;

import com.abcode.reddit.redditclone.dto.SubRedditDto;
import com.abcode.reddit.redditclone.service.SubRedditServce;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subreddit")
@AllArgsConstructor
public class SubredditController {

    private final SubRedditServce subRedditServce;

    @PostMapping
    public ResponseEntity<SubRedditDto> save(@RequestBody SubRedditDto subRedditDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(subRedditServce.save(subRedditDto));
    }

    @GetMapping
    public ResponseEntity<List<SubRedditDto>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(subRedditServce.getAll());
    }
}
