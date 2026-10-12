package org.leetcode.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionDetailResponse {

  private DataDto data;

  public DataDto getData() {
    return data;
  }

  public void setData(DataDto data) {
    this.data = data;
  }

  // ==========================================
  // ROOT DATA CONTAINER
  // ==========================================
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class DataDto {
    private List<Language> languageList;
    private List<SubmittableLanguage> submittableLanguageList;
    private List<Status> statusList;
    private QuestionDiscussionTopic questionDiscussionTopic;
    private UgcArticleOfficialSolutionArticle ugcArticleOfficialSolutionArticle;
    private QuestionDetail question;

    public List<Language> getLanguageList() {
      return languageList;
    }

    public void setLanguageList(List<Language> languageList) {
      this.languageList = languageList;
    }

    public List<SubmittableLanguage> getSubmittableLanguageList() {
      return submittableLanguageList;
    }

    public void setSubmittableLanguageList(List<SubmittableLanguage> submittableLanguageList) {
      this.submittableLanguageList = submittableLanguageList;
    }

    public List<Status> getStatusList() {
      return statusList;
    }

    public void setStatusList(List<Status> statusList) {
      this.statusList = statusList;
    }

    public QuestionDiscussionTopic getQuestionDiscussionTopic() {
      return questionDiscussionTopic;
    }

    public void setQuestionDiscussionTopic(QuestionDiscussionTopic questionDiscussionTopic) {
      this.questionDiscussionTopic = questionDiscussionTopic;
    }

    public UgcArticleOfficialSolutionArticle getUgcArticleOfficialSolutionArticle() {
      return ugcArticleOfficialSolutionArticle;
    }

    public void setUgcArticleOfficialSolutionArticle(
        UgcArticleOfficialSolutionArticle ugcArticleOfficialSolutionArticle) {
      this.ugcArticleOfficialSolutionArticle = ugcArticleOfficialSolutionArticle;
    }

    public QuestionDetail getQuestion() {
      return question;
    }

    public void setQuestion(QuestionDetail question) {
      this.question = question;
    }
  }

  // ==========================================
  // SUPPORTING METADATA CLASSES
  // ==========================================
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Language {
    private int id;
    private String name;

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class SubmittableLanguage {
    private int id;
    private String name;
    private String verboseName;
    private boolean isCompiledLang;

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getVerboseName() {
      return verboseName;
    }

    public void setVerboseName(String verboseName) {
      this.verboseName = verboseName;
    }

    public boolean isIsCompiledLang() {
      return isCompiledLang;
    }

    public void setIsCompiledLang(boolean isCompiledLang) {
      this.isCompiledLang = isCompiledLang;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Status {
    private int id;
    private String name;

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class QuestionDiscussionTopic {
    private int id;
    private int commentCount;
    private int topLevelCommentCount;

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public int getCommentCount() {
      return commentCount;
    }

    public void setCommentCount(int commentCount) {
      this.commentCount = commentCount;
    }

    public int getTopLevelCommentCount() {
      return topLevelCommentCount;
    }

    public void setTopLevelCommentCount(int topLevelCommentCount) {
      this.topLevelCommentCount = topLevelCommentCount;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class UgcArticleOfficialSolutionArticle {
    private String uuid;
    private String chargeType;
    private boolean canSee;
    private boolean hasVideoArticle;

    public String getUuid() {
      return uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }

    public String getChargeType() {
      return chargeType;
    }

    public void setChargeType(String chargeType) {
      this.chargeType = chargeType;
    }

    public boolean isCanSee() {
      return canSee;
    }

    public void setCanSee(boolean canSee) {
      this.canSee = canSee;
    }

    public boolean isHasVideoArticle() {
      return hasVideoArticle;
    }

    public void setHasVideoArticle(boolean hasVideoArticle) {
      this.hasVideoArticle = hasVideoArticle;
    }
  }

  // ==========================================
  // MAIN QUESTION DETAIL CLASS
  // ==========================================
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class QuestionDetail {
    private String title;
    private String titleSlug;
    private String questionId;
    private String questionFrontendId;
    private String questionTitle;
    private String translatedTitle;
    private String content;
    private String translatedContent;
    private String categoryTitle;
    private String difficulty;
    private String stats;
    private String companyTagStatsV2;
    private List<TopicTag> topicTags;
    private List<PositionLevelTag> positionLevelTags;
    private List<SimilarQuestion> similarQuestionList;
    private List<String> mysqlSchemas;
    private List<String> dataSchemas;
    private String frontendPreviews;
    private int likes;
    private int dislikes;
    @JsonProperty("isPaidOnly")
    private boolean isPaidOnly;
    private String status;
    private boolean canSeeQuestion;
    private boolean enableTestMode;
    private String metaData;
    private boolean enableRunCode;
    private boolean enableSubmit;
    private boolean enableDebugger;
    private String envInfo;
    private Boolean isLiked;
    private List<NextChallenge> nextChallenges;
    private String libraryUrl;
    private String adminUrl;
    private List<String> hints;
    private List<CodeSnippet> codeSnippets;
    private List<String> exampleTestcaseList;
    private boolean hasFrontendPreview;
    private List<FeaturedContest> featuredContests;
    private boolean aiJudgingAvailable;

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

    public String getQuestionId() {
      return questionId;
    }

    public void setQuestionId(String questionId) {
      this.questionId = questionId;
    }

    public String getQuestionFrontendId() {
      return questionFrontendId;
    }

    public void setQuestionFrontendId(String questionFrontendId) {
      this.questionFrontendId = questionFrontendId;
    }

    public String getQuestionTitle() {
      return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
      this.questionTitle = questionTitle;
    }

    public String getTranslatedTitle() {
      return translatedTitle;
    }

    public void setTranslatedTitle(String translatedTitle) {
      this.translatedTitle = translatedTitle;
    }

    public String getContent() {
      return content;
    }

    public void setContent(String content) {
      this.content = content;
    }

    public String getTranslatedContent() {
      return translatedContent;
    }

    public void setTranslatedContent(String translatedContent) {
      this.translatedContent = translatedContent;
    }

    public String getCategoryTitle() {
      return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
      this.categoryTitle = categoryTitle;
    }

    public String getDifficulty() {
      return difficulty;
    }

    public void setDifficulty(String difficulty) {
      this.difficulty = difficulty;
    }

    public String getStats() {
      return stats;
    }

    public void setStats(String stats) {
      this.stats = stats;
    }

    public String getCompanyTagStatsV2() {
      return companyTagStatsV2;
    }

    public void setCompanyTagStatsV2(String companyTagStatsV2) {
      this.companyTagStatsV2 = companyTagStatsV2;
    }

    public List<TopicTag> getTopicTags() {
      return topicTags;
    }

    public void setTopicTags(List<TopicTag> topicTags) {
      this.topicTags = topicTags;
    }

    public List<PositionLevelTag> getPositionLevelTags() {
      return positionLevelTags;
    }

    public void setPositionLevelTags(List<PositionLevelTag> positionLevelTags) {
      this.positionLevelTags = positionLevelTags;
    }

    public List<SimilarQuestion> getSimilarQuestionList() {
      return similarQuestionList;
    }

    public void setSimilarQuestionList(List<SimilarQuestion> similarQuestionList) {
      this.similarQuestionList = similarQuestionList;
    }

    public List<String> getMysqlSchemas() {
      return mysqlSchemas;
    }

    public void setMysqlSchemas(List<String> mysqlSchemas) {
      this.mysqlSchemas = mysqlSchemas;
    }

    public List<String> getDataSchemas() {
      return dataSchemas;
    }

    public void setDataSchemas(List<String> dataSchemas) {
      this.dataSchemas = dataSchemas;
    }

    public String getFrontendPreviews() {
      return frontendPreviews;
    }

    public void setFrontendPreviews(String frontendPreviews) {
      this.frontendPreviews = frontendPreviews;
    }

    public int getLikes() {
      return likes;
    }

    public void setLikes(int likes) {
      this.likes = likes;
    }

    public int getDislikes() {
      return dislikes;
    }

    public void setDislikes(int dislikes) {
      this.dislikes = dislikes;
    }

    public boolean isPaidOnly() {
      return isPaidOnly;
    }

    public void setPaidOnly(boolean paidOnly) {
      isPaidOnly = paidOnly;
    }

    public String getStatus() {
      return status;
    }

    public void setStatus(String status) {
      this.status = status;
    }

    public boolean isCanSeeQuestion() {
      return canSeeQuestion;
    }

    public void setCanSeeQuestion(boolean canSeeQuestion) {
      this.canSeeQuestion = canSeeQuestion;
    }

    public boolean isEnableTestMode() {
      return enableTestMode;
    }

    public void setEnableTestMode(boolean enableTestMode) {
      this.enableTestMode = enableTestMode;
    }

    public String getMetaData() {
      return metaData;
    }

    public void setMetaData(String metaData) {
      this.metaData = metaData;
    }

    public boolean isEnableRunCode() {
      return enableRunCode;
    }

    public void setEnableRunCode(boolean enableRunCode) {
      this.enableRunCode = enableRunCode;
    }

    public boolean isEnableSubmit() {
      return enableSubmit;
    }

    public void setEnableSubmit(boolean enableSubmit) {
      this.enableSubmit = enableSubmit;
    }

    public boolean isEnableDebugger() {
      return enableDebugger;
    }

    public void setEnableDebugger(boolean enableDebugger) {
      this.enableDebugger = enableDebugger;
    }

    public String getEnvInfo() {
      return envInfo;
    }

    public void setEnvInfo(String envInfo) {
      this.envInfo = envInfo;
    }

    public Boolean getIsLiked() {
      return isLiked;
    }

    public void setIsLiked(Boolean isLiked) {
      this.isLiked = isLiked;
    }

    public List<NextChallenge> getNextChallenges() {
      return nextChallenges;
    }

    public void setNextChallenges(List<NextChallenge> nextChallenges) {
      this.nextChallenges = nextChallenges;
    }

    public String getLibraryUrl() {
      return libraryUrl;
    }

    public void setLibraryUrl(String libraryUrl) {
      this.libraryUrl = libraryUrl;
    }

    public String getAdminUrl() {
      return adminUrl;
    }

    public void setAdminUrl(String adminUrl) {
      this.adminUrl = adminUrl;
    }

    public List<String> getHints() {
      return hints;
    }

    public void setHints(List<String> hints) {
      this.hints = hints;
    }

    public List<CodeSnippet> getCodeSnippets() {
      return codeSnippets;
    }

    public void setCodeSnippets(List<CodeSnippet> codeSnippets) {
      this.codeSnippets = codeSnippets;
    }

    public List<String> getExampleTestcaseList() {
      return exampleTestcaseList;
    }

    public void setExampleTestcaseList(List<String> exampleTestcaseList) {
      this.exampleTestcaseList = exampleTestcaseList;
    }

    public boolean isHasFrontendPreview() {
      return hasFrontendPreview;
    }

    public void setHasFrontendPreview(boolean hasFrontendPreview) {
      this.hasFrontendPreview = hasFrontendPreview;
    }

    public List<FeaturedContest> getFeaturedContests() {
      return featuredContests;
    }

    public void setFeaturedContests(List<FeaturedContest> featuredContests) {
      this.featuredContests = featuredContests;
    }

    public boolean isAiJudgingAvailable() {
      return aiJudgingAvailable;
    }

    public void setAiJudgingAvailable(boolean aiJudgingAvailable) {
      this.aiJudgingAvailable = aiJudgingAvailable;
    }
  }

  // ==========================================
  // QUESTION INNER SUB-CLASSES
  // ==========================================
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class TopicTag {
    private String name;
    private String slug;
    private String translatedName;

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

    public String getTranslatedName() {
      return translatedName;
    }

    public void setTranslatedName(String translatedName) {
      this.translatedName = translatedName;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class PositionLevelTag {
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

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class SimilarQuestion {
    private String difficulty;
    private String titleSlug;
    private String title;
    private String translatedTitle;
    @JsonProperty("isPaidOnly")
    private boolean isPaidOnly;

    public String getDifficulty() {
      return difficulty;
    }

    public void setDifficulty(String difficulty) {
      this.difficulty = difficulty;
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

    public boolean isPaidOnly() {
      return isPaidOnly;
    }

    public void setPaidOnly(boolean paidOnly) {
      isPaidOnly = paidOnly;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class NextChallenge {
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

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class CodeSnippet {
    private String code;
    private String lang;
    private String langSlug;

    public String getCode() {
      return code;
    }

    public void setCode(String code) {
      this.code = code;
    }

    public String getLang() {
      return lang;
    }

    public void setLang(String lang) {
      this.lang = lang;
    }

    public String getLangSlug() {
      return langSlug;
    }

    public void setLangSlug(String langSlug) {
      this.langSlug = langSlug;
    }
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class FeaturedContest {
    private String titleSlug;
    private String title;

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
  }
}
