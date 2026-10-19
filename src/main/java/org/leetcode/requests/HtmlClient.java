package org.leetcode.requests;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

/**
 * HtmlClient
 */
public class HtmlClient {

  public String getHtmlResponse(String url) throws IOException, InterruptedException {

    Document doc = Jsoup.connect("https://leetcode.com" + url)
        .header("content-type", "application/json")
        .header("Origin", "https://leetcode.com")
        .header("Referer", "https://leetcode.com/problemset/")
        .header("Cookie", System.getenv("LEETCODE_COOKIE"))
        .header("x-csrftoken", System.getenv("LEETCODE_CSRF"))
        .header("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:159.0) Gecko/20100101 Firefox/159.0")
        .get();
    Element meta = doc.selectFirst("meta[name=description]");
    String content = Parser.unescapeEntities(meta.attr("content"), false);
    return content;
  }

  public String getQuestionDetail(String url) throws IOException, InterruptedException {

    Document doc = Jsoup.connect("https://leetcode.com/problems/" + url)
        .header("content-type", "application/json")
        .header("Origin", "https://leetcode.com")
        .header("Referer", "https://leetcode.com/problemset/")
        .header("Cookie", System.getenv("LEETCODE_COOKIE"))
        .header("x-csrftoken", System.getenv("LEETCODE_CSRF"))
        .header("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:159.0) Gecko/20100101 Firefox/159.0")
        .get();
    Element meta = doc.selectFirst("meta[name=description]");
    String content = Parser.unescapeEntities(meta.attr("content"), false);
    return content;
  }
}
