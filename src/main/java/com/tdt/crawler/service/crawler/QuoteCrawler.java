package com.tdt.crawler.service.crawler;

import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.url.WebURL;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class QuoteCrawler extends WebCrawler {

    @Value("${quote.pattern}")
    private String pattern;
    @Value("${quote.url}")
    private String url;

    @Override
    public boolean shouldVisit(Page referringPage, WebURL url) {
        return super.shouldVisit(referringPage, url);
    }

    @Override
    public void visit(Page page) {
        super.visit(page);
    }
}
