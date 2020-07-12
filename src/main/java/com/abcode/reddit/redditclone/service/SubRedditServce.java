package com.abcode.reddit.redditclone.service;

import com.abcode.reddit.redditclone.dto.SubRedditDto;
import com.abcode.reddit.redditclone.model.Subreddit;
import com.abcode.reddit.redditclone.repository.SubredditRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class SubRedditServce {

    private final SubredditRepository subredditRepository;

    @Transactional
    public SubRedditDto save(SubRedditDto subRedditDto) {
        Subreddit save = subredditRepository.save(mapSubredditDto(subRedditDto));
        subRedditDto.setId(save.getId());
        return subRedditDto;
    }

    private Subreddit mapSubredditDto(SubRedditDto subRedditDto) {
        return Subreddit.builder().name(subRedditDto.getName())
                .description(subRedditDto.getDescription())
                .build();
    }

    public List<SubRedditDto> getAll() {
        return subredditRepository.findAll()
                        .stream()
                        .map(this::mapToDto)
                        .collect(Collectors.toList());
    }

    private SubRedditDto mapToDto(Subreddit subreddit) {
        return SubRedditDto.builder().name(subreddit.getName())
                .id(subreddit.getId())
                .numberOfPosts(subreddit.getPosts().size())
                .build();
    }
}
