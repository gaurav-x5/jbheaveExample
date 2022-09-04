package com.jbehave.exampleJbehave;

import com.jbehave.exampleJbehave.models.Filter;
import net.serenitybdd.jbehave.SerenityStories;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.StoryFinder;
import org.junit.Test;

import java.util.ArrayList;
import org.json.*;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class StoryRunner extends SerenityStories {

    public static List<String> metaTags;

    @Test
    @Override
    public void run() {
        Embedder embedder = this.configuredEmbedder();
        try {
            embedder.embedderControls().doGenerateViewAfterStories(true).doIgnoreFailureInStories(true)
                    .doIgnoreFailureInView(true).useThreads(1).useStoryTimeouts("600");

            if(metaTags.size() != 0) {
                String metaS = String.join(" ",metaTags);
                embedder.useMetaFilters(asList(metaS));
            }
            embedder.runStoriesAsPaths(this.storyPaths());
        } finally {
            embedder.generateCrossReference();
            embedder.generateSurefireReport();
        }
    }

    @Override
    public List<String> storyPaths() {
        return new StoryFinder().findPaths(CodeLocations.codeLocationFromClass(getClass()),
                "**/*.story", "");
    }

    public static void main(String[] args) {
        new StoryRunner().run();
    }
}
