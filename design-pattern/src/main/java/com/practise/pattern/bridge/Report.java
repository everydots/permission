package com.practise.pattern.bridge;

import java.util.List;

public class Report {

    Reporter reporter;

    public Report(Reporter reporter) {
        this.reporter = reporter;
    }

    public void addReportItem(Object item) {
        reporter.addLine(item.toString());
    }

    public void addReportItems(List items) {
        for (int index = 0; index < items.size(); index++) {
            Object item = items.get(index);
            reporter.addLine(item.toString());
        }
    }

    public String getReport() {
        return reporter.getReport();
    }
}
