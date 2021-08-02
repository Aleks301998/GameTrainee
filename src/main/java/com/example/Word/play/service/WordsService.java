package com.example.Word.play.service;

import com.example.Word.play.dto.Words;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WordsService {
    public Words processWords(Words words) {
        List<String> wordsList = words.getWords();
        List<String> validWords = new ArrayList<>();
        for (int i = 0; i < wordsList.size(); i++) {
            String word = wordsList.get(i);
            if (i == 0 && !word.equals("")) {
                validWords.add(wordsList.get(i));
            } else if (word != null && !word.equals("") && word.charAt(0) == validWords.get(i - 1).charAt(validWords.get(i - 1).length() - 1)) {
                validWords.add(word);
            } else {
                break;
            }
        }
        Words response = new Words();
        response.setWords(validWords);
        return response;
    }
}
