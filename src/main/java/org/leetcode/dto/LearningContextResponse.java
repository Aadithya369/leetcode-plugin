package org.leetcode.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LearningContextResponse {

  private DataDto data;

  public DataDto getData() {
    return data;
  }

  public void setData(DataDto data) {
    this.data = data;
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class DataDto {
    private LearningContextV2 learningContextV2;

    public LearningContextV2 getLearningContextV2() {
      return learningContextV2;
    }

    public void setLearningContextV2(LearningContextV2 learningContextV2) {
      this.learningContextV2 = learningContextV2;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class LearningContextV2 {
    private String name;
    private String backLink;
    private QuestionRef nextQuestion;
    private QuestionRef previousQuestion;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getBackLink() {
      return backLink;
    }

    public void setBackLink(String backLink) {
      this.backLink = backLink;
    }

    public QuestionRef getNextQuestion() {
      return nextQuestion;
    }

    public void setNextQuestion(QuestionRef nextQuestion) {
      this.nextQuestion = nextQuestion;
    }

    public QuestionRef getPreviousQuestion() {
      return previousQuestion;
    }

    public void setPreviousQuestion(QuestionRef previousQuestion) {
      this.previousQuestion = previousQuestion;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class QuestionRef {
    private String difficulty;
    private String title;
    private String titleSlug;
    private String questionFrontendId;

    public String getDifficulty() {
      return difficulty;
    }

    public void setDifficulty(String difficulty) {
      this.difficulty = difficulty;
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

    public String getQuestionFrontendId() {
      return questionFrontendId;
    }

    public void setQuestionFrontendId(String questionFrontendId) {
      this.questionFrontendId = questionFrontendId;
    }
  }
}
