package org.leetcode.parsers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProblemsetQuestionListV2 {

    private DataDto data;

    public DataDto getData() { return data; }
    public void setData(DataDto data) { this.data = data; }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DataDto {
        private ProblemsetQuestionListDto problemsetQuestionListV2;

        public ProblemsetQuestionListDto getProblemsetQuestionListV2() { return problemsetQuestionListV2; }
        public void setProblemsetQuestionListV2(ProblemsetQuestionListDto problemsetQuestionListV2) {
            this.problemsetQuestionListV2 = problemsetQuestionListV2;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ProblemsetQuestionListDto {
        private List<QuestionDto> questions;

        public List<QuestionDto> getQuestions() { return questions; }
        public void setQuestions(List<QuestionDto> questions) { this.questions = questions; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class QuestionDto {
        private Integer id;


        private String questionFrontendId;

        private String title;
        private String titleSlug;
        private String difficulty;
        private String status;
        private Boolean paidOnly;
        private Double acRate;
        private Boolean isInMyFavorites;
        private Double frequency;
        private Integer contestPoint;
        private List<TagDto> topicTags;

        // Getters and Setters
        public Integer getId() { return id; }
        public void setId(Integer id) { this.id = id; }

        public String getQuestionFrontendId() { return questionFrontendId; }
        public void setQuestionFrontendId(String questionFrontendId) { this.questionFrontendId = questionFrontendId; }

        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }

        public String getTitleSlug() { return titleSlug; }
        public void setTitleSlug(String titleSlug) { this.titleSlug = titleSlug; }

        public String getDifficulty() { return difficulty; }
        public void setDifficulty(String difficulty) { this.difficulty = difficulty; }

        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }

        public Boolean getPaidOnly() { return paidOnly; }
        public void setPaidOnly(Boolean paidOnly) { this.paidOnly = paidOnly; }

        public Double getAcRate() { return acRate; }
        public void setAcRate(Double acRate) { this.acRate = acRate; }

        public Boolean getIsInMyFavorites() { return isInMyFavorites; }
        public void setIsInMyFavorites(Boolean isInMyFavorites) { this.isInMyFavorites = isInMyFavorites; }

        public Double getFrequency() { return frequency; }
        public void setFrequency(Double frequency) { this.frequency = frequency; }

        public Integer getContestPoint() { return contestPoint; }
        public void setContestPoint(Integer contestPoint) { this.contestPoint = contestPoint; }

        public List<TagDto> getTopicTags() { return topicTags; }
        public void setTopicTags(List<TagDto> topicTags) { this.topicTags = topicTags; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TagDto {
        private String name;
        private String slug;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getSlug() { return slug; }
        public void setSlug(String slug) { this.slug = slug; }
    }
}