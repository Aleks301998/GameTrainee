package com.example.Word.play.dto;

import java.util.List;
import java.util.Objects;

public class Words {
    private List<String> words;

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Words words1 = (Words) o;
        return Objects.equals(words, words1.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }
}
