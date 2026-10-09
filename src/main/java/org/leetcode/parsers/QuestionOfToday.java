package org.leetcode.parsers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionOfToday {

    private DataDto data;

    public DataDto getData() { return data; }
    public void setData(DataDto data) { this.data = data; }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DataDto {
        private  ActiveDailyCodingChallengeQuestion activeDailyCodingChallengeQuestion;

        public ActiveDailyCodingChallengeQuestion getActiveDailyCodingChallengeQuestion() { return this.activeDailyCodingChallengeQuestion; }
        public void setActiveDailyCodingChallengeQuestion(ActiveDailyCodingChallengeQuestion activeDailyCodingChallengeQuestion) {
            this.activeDailyCodingChallengeQuestion = activeDailyCodingChallengeQuestion;
        }
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class  ActiveDailyCodingChallengeQuestion {
        private String link;
        public String getLink() { return link; }
    }
}
