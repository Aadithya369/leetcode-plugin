package org.leetcode.parsers;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class ProblemList {
    @JsonProperty("questionFrontId")
    String questionFrontId;
    @JsonProperty("title")
    String title;
    @JsonProperty("titleSlug")
    String titleSlug;
    @JsonProperty("difficulty")
    String difficulty;
    @JsonProperty("acRate")
    String acRate;
    @JsonProperty("topicTags")
    List<String> topicTags = new ArrayList<>();

    public String getQuestionFrontId() {
        return questionFrontId;
    }

    public void setQuestionFrontId(String questionFrontId) {
        this.questionFrontId = questionFrontId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleSlug() {
        return titleSlug;
    }

    public void setTitleSlug(String titleSlug) {
        this.titleSlug = titleSlug;
    }

    public List<String> getTopicTags() {
        return topicTags;
    }
    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getAcRate() {
        return acRate;
    }

    public void setAcRate(String acRate) {
        this.acRate = acRate;
    }

    public void setTopicTags(List<String> topicTags) {
        this.topicTags = topicTags;
    }
}
