package org.leetcode.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FavoriteList {

  private DataDto data;

  public DataDto getData() {
    return data;
  }

  public void setData(DataDto data) {
    this.data = data;
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class DataDto {
    private FavoriteQuestionList favoriteQuestionList;

    public FavoriteQuestionList getFavoriteQuestionList() {
      return favoriteQuestionList;
    }

    public void setFavoriteQuestionList(FavoriteQuestionList favoriteQuestionList) {
      this.favoriteQuestionList = favoriteQuestionList;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class FavoriteQuestionList {
    private List<Question> questions;
    private int totalLength;
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

    public boolean isHasMore() {
      return hasMore;
    }

    public void setHasMore(boolean hasMore) {
      this.hasMore = hasMore;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Question {
    private String difficulty;
    private int id;
    @JsonProperty("paidOnly")
    private boolean paidOnly;
    private String questionFrontendId;
    private String status;
    private String title;
    private String titleSlug;
    private String translatedTitle;
    private boolean isInMyFavorites;
    private Object frequency;
    private double acRate;
    private Object contestPoint;
    private List<TopicTag> topicTags;

    public String getDifficulty() {
      return difficulty;
    }

    public void setDifficulty(String difficulty) {
      this.difficulty = difficulty;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public boolean isPaidOnly() {
      return paidOnly;
    }

    public void setPaidOnly(boolean paidOnly) {
      this.paidOnly = paidOnly;
    }

    public String getQuestionFrontendId() {
      return questionFrontendId;
    }

    public void setQuestionFrontendId(String questionFrontendId) {
      this.questionFrontendId = questionFrontendId;
    }

    public String getStatus() {
      return status;
    }

    public void setStatus(String status) {
      this.status = status;
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

    public String getTranslatedTitle() {
      return translatedTitle;
    }

    public void setTranslatedTitle(String translatedTitle) {
      this.translatedTitle = translatedTitle;
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

    public List<TopicTag> getTopicTags() {
      return topicTags;
    }

    public void setTopicTags(List<TopicTag> topicTags) {
      this.topicTags = topicTags;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class TopicTag {
    private String name;
    private String nameTranslated;
    private String slug;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getNameTranslated() {
      return nameTranslated;
    }

    public void setNameTranslated(String nameTranslated) {
      this.nameTranslated = nameTranslated;
    }

    public String getSlug() {
      return slug;
    }

    public void setSlug(String slug) {
      this.slug = slug;
    }
  }
}
