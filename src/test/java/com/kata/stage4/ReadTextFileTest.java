package com.kata.stage4;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public final class ReadTextFileTest {
    @Test
    public void shouldReadTheTextFileInTheResourcesFolder() {
        ReadTextFile readTextFile = new ReadTextFile();
        int actualNumberOfLinesInTheFile = readTextFile.readFileFromResources("TextFile").size();
        assertThat(actualNumberOfLinesInTheFile, Is.is(4));
    }
}