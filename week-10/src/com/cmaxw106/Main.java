package com.cmaxw106;

/**
 * Created by Clint on 4/7/2016.
 */
import java.util.ArrayList;
import java.util.List;

class NewsItem {
    private String title;
    private String content;

    NewsItem(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}

interface NewsViewer {
    public void update(NewsItem item);
}

class NewsCollection {
    private List<NewsItem> collection = new ArrayList<>();
    private List<NewsViewer> viewers = new ArrayList<>();

    // add a listener
    public void addViewer(NewsViewer viewer) {
        viewers.add(viewer);
    }

    // update listeners
    public void updateViewers(NewsItem item) {
        for (NewsViewer viewer: viewers) {
            viewer.update(item);
        }
    }

    public void addNewsItem(NewsItem item) {
        collection.add(item);
        updateViewers(item);
    }

    public void addNewsItem(String title, String content) {
        addNewsItem(new NewsItem(title, content));
    }
}

class ConsoleViewer implements NewsViewer{
    // method called by objects that update listeners
    public void update(NewsItem item){
        System.out.println("Breaking News (displayed by ConsoleViewer): " + item.getTitle());
    }
}

public class Main {
    public static void main(String[] args) {
        NewsViewer consoleNews = new ConsoleViewer();
        NewsCollection allTheNews = new NewsCollection();
        allTheNews.addViewer(consoleNews);

        allTheNews.addNewsItem("Lotto Winner", "Bob won the lottery!");
        allTheNews.addNewsItem("Forecast", "It's going to be nice outside.");
    }
}
