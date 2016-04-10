package com.practise.pattern.bridge;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StockReportListTest {

    @Test
    public void shouldReportLine() throws Exception {
        String line = "Line1";

        Reporter reporter = new HtmlReporter();
        Report report = new StockReportList(reporter);
        reporter.addLine(line);

        assertThat(report.getReport().contains(line), is(true));
    }
}