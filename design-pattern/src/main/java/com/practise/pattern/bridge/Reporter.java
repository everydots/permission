package com.practise.pattern.bridge;

public abstract class Reporter {

    String header = "";

    String trailer = "";

    String report = "";

    public abstract void addLine(String line);

    public String getReport() {
        return header + trailer + report;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public void setReport(String report) {
        this.report = report;
    }
}
