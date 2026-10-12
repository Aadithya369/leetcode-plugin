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

    Document doc = Jsoup.connect("https://leetcode.com/problems/two-sum/description/").get();
    Element meta = doc.selectFirst("meta[name=description]");
    String content = Parser.unescapeEntities(meta.attr("content"), false);
    return content;
  }
}
