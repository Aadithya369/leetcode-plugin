package org.leetcode.queries;

public class Queries {
  public static String getProblemsetQuestionListV2(int skip) {
    return String.format(
        """
                  {"query":"\\n    query problemsetQuestionListV2($filters: QuestionFilterInput, $limit: Int, $searchKeyword: String, $skip: Int, $sortBy: QuestionSortByInput, $categorySlug: String) {\\n  problemsetQuestionListV2(\\n    filters: $filters\\n    limit: $limit\\n    searchKeyword: $searchKeyword\\n    skip: $skip\\n    sortBy: $sortBy\\n    categorySlug: $categorySlug\\n  ) {\\n    questions {\\n      id\\n      titleSlug\\n      title\\n      translatedTitle\\n      questionFrontendId\\n      paidOnly\\n      difficulty\\n      topicTags {\\n        name\\n        slug\\n        nameTranslated\\n      }\\n      status\\n      isInMyFavorites\\n      frequency\\n      acRate\\n      contestPoint\\n    }\\n    totalLength\\n    finishedLength\\n    hasMore\\n  }\\n}\\n    ","variables":{"skip":%d,"limit":100,"categorySlug":"all-code-essentials","filters":{"filterCombineType":"ALL","statusFilter":{"questionStatuses":[],"operator":"IS"},"difficultyFilter":{"difficulties":[],"operator":"IS"},"languageFilter":{"languageSlugs":[],"operator":"IS"},"topicFilter":{"topicSlugs":[],"operator":"IS"},"acceptanceFilter":{},"frequencyFilter":{},"frontendIdFilter":{},"lastSubmittedFilter":{},"publishedFilter":{},"companyFilter":{"companySlugs":[],"operator":"IS"},"positionFilter":{"positionSlugs":[],"operator":"IS"},"positionLevelFilter":{"positionLevelSlugs":[],"operator":"IS"},"contestPointFilter":{"contestPoints":[],"operator":"IS"},"premiumFilter":{"premiumStatus":[],"operator":"IS"}},"searchKeyword":"","sortBy":{"sortField":"CUSTOM","sortOrder":"ASCENDING"},"filtersV2":{"filterCombineType":"ALL","statusFilter":{"questionStatuses":[],"operator":"IS"},"difficultyFilter":{"difficulties":[],"operator":"IS"},"languageFilter":{"languageSlugs":[],"operator":"IS"},"topicFilter":{"topicSlugs":[],"operator":"IS"},"acceptanceFilter":{},"frequencyFilter":{},"frontendIdFilter":{},"lastSubmittedFilter":{},"publishedFilter":{},"companyFilter":{"companySlugs":[],"operator":"IS"},"positionFilter":{"positionSlugs":[],"operator":"IS"},"positionLevelFilter":{"positionLevelSlugs":[],"operator":"IS"},"contestPointFilter":{"contestPoints":[],"operator":"IS"},"premiumFilter":{"premiumStatus":[],"operator":"IS"}}},"operationName":"problemsetQuestionListV2"}
            """,
        skip);
  }

  static public String getSolvedProblems() {
    return """
        {
          "query": "query problemsetQuestionListV2($filters: QuestionFilterInput, $limit: Int, $searchKeyword: String, $skip: Int, $sortBy: QuestionSortByInput, $categorySlug: String) { problemsetQuestionListV2(filters: $filters, limit: $limit, searchKeyword: $searchKeyword, skip: $skip, sortBy: $sortBy, categorySlug: $categorySlug) { questions { id titleSlug title questionFrontendId difficulty status acRate } totalLength finishedLength hasMore } }",
          "variables": {
            "skip": 0,
            "limit": 100,
            "categorySlug": "all-code-essentials",
            "filters": {
              "filterCombineType": "ALL",
              "statusFilter": {
                "questionStatuses": ["SOLVED"],
                "operator": "IS"
              }
            },
            "searchKeyword": "",
            "sortBy": {
              "sortField": "CUSTOM",
              "sortOrder": "ASCENDING"
            }
          },
          "operationName": "problemsetQuestionListV2"
        }
        """;
  }

  public static String getQuestionOfToday() {
    return """
        {"query":"\\n    query questionOfToday {\\n  activeDailyCodingChallengeQuestion {\\n    link\\n  }\\n}\\n    ","variables":{},"operationName":"questionOfToday"}
        """;
  }

  public static String getQuestionDetail(String questionTitle) {
    return String.format(
        """
            {"query":"\\n    query questionDetail($titleSlug: String!) {\\n  languageList {\\n    id\\n    name\\n  }\\n  submittableLanguageList {\\n    id\\n    name\\n    verboseName\\n    isCompiledLang\\n  }\\n  statusList {\\n    id\\n    name\\n  }\\n  questionDiscussionTopic(questionSlug: $titleSlug) {\\n    id\\n    commentCount\\n    topLevelCommentCount\\n  }\\n  ugcArticleOfficialSolutionArticle(questionSlug: $titleSlug) {\\n    uuid\\n    chargeType\\n    canSee\\n    hasVideoArticle\\n  }\\n  question(titleSlug: $titleSlug) {\\n    title\\n    titleSlug\\n    questionId\\n    questionFrontendId\\n    questionTitle\\n    translatedTitle\\n    content\\n    translatedContent\\n    categoryTitle\\n    difficulty\\n    stats\\n    companyTagStatsV2\\n    topicTags {\\n      name\\n      slug\\n      translatedName\\n    }\\n    positionLevelTags {\\n      name\\n      nameTranslated\\n      slug\\n    }\\n    similarQuestionList {\\n      difficulty\\n      titleSlug\\n      title\\n      translatedTitle\\n      isPaidOnly\\n    }\\n    mysqlSchemas\\n    dataSchemas\\n    frontendPreviews\\n    likes\\n    dislikes\\n    isPaidOnly\\n    status\\n    canSeeQuestion\\n    enableTestMode\\n    metaData\\n    enableRunCode\\n    enableSubmit\\n    enableDebugger\\n    envInfo\\n    isLiked\\n    nextChallenges {\\n      difficulty\\n      title\\n      titleSlug\\n      questionFrontendId\\n    }\\n    libraryUrl\\n    adminUrl\\n    hints\\n    codeSnippets {\\n      code\\n      lang\\n      langSlug\\n    }\\n    exampleTestcaseList\\n    hasFrontendPreview\\n    featuredContests {\\n      titleSlug\\n      title\\n    }\\n    aiJudgingAvailable\\n  }\\n}\\n    ","variables":{"titleSlug":"%s"},"operationName":"questionDetail"}
            """,
        questionTitle);
  }

  public static String getLearningContext(String title) {
    return String.format(
        """
            {"query":"\\n    query learningContext($currentQuestionSlug: String!, $categorySlug: String, $envId: String, $envType: String, $filters: QuestionListFilterInput, $favoriteFilters: FavoriteQuestionFilterInput, $version: String, $childFavoriteSlug: String, $filtersV2: QuestionFilterInput, $sortBy: QuestionSortByInput, $searchKeyword: String) {\\n  learningContextV2(\\n    currentQuestionSlug: $currentQuestionSlug\\n    categorySlug: $categorySlug\\n    envId: $envId\\n    envType: $envType\\n    filters: $filters\\n    favoriteFilters: $favoriteFilters\\n    version: $version\\n    childFavoriteSlug: $childFavoriteSlug\\n    filtersV2: $filtersV2\\n    sortBy: $sortBy\\n    searchKeyword: $searchKeyword\\n  ) {\\n    name\\n    backLink\\n    nextQuestion {\\n      difficulty\\n      title\\n      titleSlug\\n      questionFrontendId\\n    }\\n    previousQuestion {\\n      difficulty\\n      title\\n      titleSlug\\n      questionFrontendId\\n    }\\n  }\\n}\\n    ","variables":{"currentQuestionSlug":"%s","filtersV2":{"filterCombineType":"ALL","statusFilter":{"questionStatuses":["SOLVED"],"operator":"IS"},"difficultyFilter":{"difficulties":[],"operator":"IS"},"languageFilter":{"languageSlugs":[],"operator":"IS"},"topicFilter":{"topicSlugs":[],"operator":"IS"},"acceptanceFilter":{},"frequencyFilter":{},"frontendIdFilter":{},"lastSubmittedFilter":{},"publishedFilter":{},"companyFilter":{"companySlugs":[],"operator":"IS"},"positionFilter":{"positionSlugs":[],"operator":"IS"},"positionLevelFilter":{"positionLevelSlugs":[],"operator":"IS"},"contestPointFilter":{"contestPoints":[],"operator":"IS"},"premiumFilter":{"premiumStatus":[],"operator":"IS"}},"searchKeyword":"","sortBy":{"sortField":"CUSTOM","sortOrder":"ASCENDING"},"version":"v3","envType":"problem-list","envId":"","favoriteFilters":{}},"operationName":"learningContext"}
                        """,
        title);
  }

  public static String getRandomQuesiton() {
    return """
        {"query":"\\n    query randomQuestionV2($favoriteSlug: String, $categorySlug: String, $searchKeyword: String, $filtersV2: QuestionFilterInput) {\\n  randomQuestionV2(\\n    favoriteSlug: $favoriteSlug\\n    categorySlug: $categorySlug\\n    filtersV2: $filtersV2\\n    searchKeyword: $searchKeyword\\n  ) {\\n    titleSlug\\n  }\\n}\\n    ","variables":{"categorySlug":"all-code-essentials","filtersV2":{"filterCombineType":"ALL","statusFilter":{"questionStatuses":[],"operator":"IS"},"difficultyFilter":{"difficulties":[],"operator":"IS"},"languageFilter":{"languageSlugs":[],"operator":"IS"},"topicFilter":{"topicSlugs":[],"operator":"IS"},"acceptanceFilter":{},"frequencyFilter":{},"frontendIdFilter":{},"lastSubmittedFilter":{},"publishedFilter":{},"companyFilter":{"companySlugs":[],"operator":"IS"},"positionFilter":{"positionSlugs":[],"operator":"IS"},"positionLevelFilter":{"positionLevelSlugs":[],"operator":"IS"},"contestPointFilter":{"contestPoints":[],"operator":"IS"},"premiumFilter":{"premiumStatus":[],"operator":"IS"}},"searchKeyword":""},"operationName":"randomQuestionV2"}
                        """;
  }

  public static String getFavoriteList(String favoriteSlug) {
    return String.format(
        """
            {"query":"\\n    query favoriteQuestionList($favoriteSlug: String!, $filter: FavoriteQuestionFilterInput, $filtersV2: QuestionFilterInput, $searchKeyword: String, $sortBy: QuestionSortByInput, $limit: Int, $skip: Int, $version: String = \\"v2\\") {\\n  favoriteQuestionList(\\n    favoriteSlug: $favoriteSlug\\n    filter: $filter\\n    filtersV2: $filtersV2\\n    searchKeyword: $searchKeyword\\n    sortBy: $sortBy\\n    limit: $limit\\n    skip: $skip\\n    version: $version\\n  ) {\\n    questions {\\n     difficulty\\n     id\\n     paidOnly\\n     questionFrontendId\\n     status\\n     title\\n     titleSlug\\n     translatedTitle\\n     isInMyFavorites\\n     frequency\\n     acRate\\n     contestPoint\\n     topicTags {\\n      name\\n      nameTranslated\\n      slug\\n     }\\n    }\\n    totalLength\\n    hasMore\\n  }\\n}\\n    ","variables":{"skip":0,"limit":100,"favoriteSlug":"%s","filtersV2":{"filterCombineType":"ALL","statusFilter":{"questionStatuses":[],"operator":"IS"},"difficultyFilter":{"difficulties":[],"operator":"IS"},"languageFilter":{"languageSlugs":[],"operator":"IS"},"topicFilter":{"topicSlugs":[],"operator":"IS"},"acceptanceFilter":{},"frequencyFilter":{},"frontendIdFilter":{},"lastSubmittedFilter":{},"publishedFilter":{},"companyFilter":{"companySlugs":[],"operator":"IS"},"positionFilter":{"positionSlugs":[],"operator":"IS"},"positionLevelFilter":{"positionLevelSlugs":[],"operator":"IS"},"contestPointFilter":{"contestPoints":[],"operator":"IS"},"premiumFilter":{"premiumStatus":[],"operator":"IS"}},"searchKeyword":"","sortBy":{"sortField":"CUSTOM","sortOrder":"ASCENDING"}},"operationName":"favoriteQuestionList"}
            """,
        favoriteSlug);
  }

  public static String getSubmissionID(String lang, String questionID, String typedCode) {
    return String.format("""
        {"lang":"%s","question_id":"%s","typed_code":"%s"}
                """, lang, questionID, typedCode);
  }
}
