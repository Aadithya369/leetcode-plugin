package org.leetcode.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
    private int totalLength;

    public int getTotalLength() {
      return totalLength;
    }

    public void setTotalLength(int totalLength) {
      this.totalLength = totalLength;
    }
  }
}
