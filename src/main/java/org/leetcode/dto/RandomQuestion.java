package org.leetcode.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RandomQuestion {

  private DataDto data;

  public DataDto getData() {
    return data;
  }

  public void setData(DataDto data) {
    this.data = data;
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class DataDto {
    private RandomQuestionV2 randomQuestionV2;

    public RandomQuestionV2 getRandomQuestionV2() {
      return randomQuestionV2;
    }

    public void setRandomQuestionV2(RandomQuestionV2 randomQuestionV2) {
      this.randomQuestionV2 = randomQuestionV2;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class RandomQuestionV2 {
    private String titleSlug;

    public String getTitleSlug() {
      return titleSlug;
    }

    public void setTitleSlug(String titleSlug) {
      this.titleSlug = titleSlug;
    }
  }
}
