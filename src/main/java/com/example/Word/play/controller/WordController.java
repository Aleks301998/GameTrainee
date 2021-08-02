package com.example.Word.play.controller;

import com.example.Word.play.dto.Words;
import com.example.Word.play.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/words")
public class WordController {

    private WordsService wordsService;

    @Autowired
    public void setWordsService(WordsService wordsService) {
        this.wordsService = wordsService;
    }
    @PostMapping(path = "/process")
    public Words processWords(@RequestBody Words words) {
        return wordsService.processWords(words);
    }
}
