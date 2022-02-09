package edu.bsu.cs222;

import edu.bsu.cs222.model.WikiPageParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class WikiPageParserTest {

    @Test
    public void testParse() throws IOException {
        WikiPageParser parser = new WikiPageParser();
        InputStream testDataStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("test.json");
        String timestamp = parser.parse(testDataStream);
        Assertions.assertEquals("2021-12-04T18:29:33Z", timestamp);
    }



}
