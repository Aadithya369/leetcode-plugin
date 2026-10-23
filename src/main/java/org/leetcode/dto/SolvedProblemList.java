package org.leetcode.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SolvedProblemList {

  private DataDto data;

  public DataDto getData() {
    return data;
  }

  public void setData(DataDto data) {
    this.data = data;
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class DataDto {
    private ProblemsetQuestionListV2 problemsetQuestionListV2;

    public ProblemsetQuestionListV2 getProblemsetQuestionListV2() {
      return problemsetQuestionListV2;
    }

    public void setProblemsetQuestionListV2(ProblemsetQuestionListV2 problemsetQuestionListV2) {
      this.problemsetQuestionListV2 = problemsetQuestionListV2;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class ProblemsetQuestionListV2 {
    private List<Question> questions;
    private int totalLength;
    private int finishedLength;
    private boolean hasMore;

    public List<Question> getQuestions() {
      return questions;
    }

    public void setQuestions(List<Question> questions) {
      this.questions = questions;
    }

    public int getTotalLength() {
      return totalLength;
    }

    public void setTotalLength(int totalLength) {
      this.totalLength = totalLength;
    }

    public int getFinishedLength() {
      return finishedLength;
    }

    public void setFinishedLength(int finishedLength) {
      this.finishedLength = finishedLength;
    }

    public boolean isHasMore() {
      return hasMore;
    }

    public void setHasMore(boolean hasMore) {
      this.hasMore = hasMore;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Question {
    private int id;
    private String titleSlug;
    private String title;
    private String translatedTitle;
    private String questionFrontendId;
    @JsonProperty("paidOnly")
    private boolean paidOnly;
    private String difficulty;
    private List<TopicTag> topicTags;
    private String status;
    private boolean isInMyFavorites;
    private Object frequency;
    private double acRate;
    private Object contestPoint;

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getTitleSlug() {
      return titleSlug;
    }

    public void setTitleSlug(String titleSlug) {
      this.titleSlug = titleSlug;
    }

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public String getTranslatedTitle() {
      return translatedTitle;
    }

    public void setTranslatedTitle(String translatedTitle) {
      this.translatedTitle = translatedTitle;
    }

    public String getQuestionFrontendId() {
      return questionFrontendId;
    }

    public void setQuestionFrontendId(String questionFrontendId) {
      this.questionFrontendId = questionFrontendId;
    }

    public boolean isPaidOnly() {
      return paidOnly;
    }

    public void setPaidOnly(boolean paidOnly) {
      this.paidOnly = paidOnly;
    }

    public String getDifficulty() {
      return difficulty;
    }

    public void setDifficulty(String difficulty) {
      this.difficulty = difficulty;
    }

    public List<TopicTag> getTopicTags() {
      return topicTags;
    }

    public void setTopicTags(List<TopicTag> topicTags) {
      this.topicTags = topicTags;
    }

    public String getStatus() {
      return status;
    }

    public void setStatus(String status) {
      this.status = status;
    }

    public boolean isIsInMyFavorites() {
      return isInMyFavorites;
    }

    public void setIsInMyFavorites(boolean isInMyFavorites) {
      this.isInMyFavorites = isInMyFavorites;
    }

    public Object getFrequency() {
      return frequency;
    }

    public void setFrequency(Object frequency) {
      this.frequency = frequency;
    }

    public double getAcRate() {
      return acRate;
    }

    public void setAcRate(double acRate) {
      this.acRate = acRate;
    }

    public Object getContestPoint() {
      return contestPoint;
    }

    public void setContestPoint(Object contestPoint) {
      this.contestPoint = contestPoint;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class TopicTag {
    private String name;
    private String slug;
    private String nameTranslated;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getSlug() {
      return slug;
    }

    public void setSlug(String slug) {
      this.slug = slug;
    }

    public String getNameTranslated() {
      return nameTranslated;
    }

    public void setNameTranslated(String nameTranslated) {
      this.nameTranslated = nameTranslated;
    }
  }
}
