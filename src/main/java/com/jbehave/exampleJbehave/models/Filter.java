package com.jbehave.exampleJbehave.models;

import java.util.List;

public class Filter {
    public List<String> metaTags;
    public List<String> stories;

    public Filter(List<String> metaTags, List<String> stories) {
        this.metaTags = metaTags;
        this.stories = stories;
    }

    public List<String> getMetaTags() {
        return metaTags;
    }

    public void setMetaTags(List<String> metaTags) {
        this.metaTags = metaTags;
    }

    public List<String> getStories() {
        return stories;
    }

    public void setStories(List<String> stories) {
        this.stories = stories;
    }

    public Filter() {
    }
}
