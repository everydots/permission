package com.practise.pattern.bridge;

public class HtmlReporter extends Reporter {

    public HtmlReporter() {
        setHeader("<HTML>\\n<HEAD></HEAD>\\n<BODY>\\n");
        setTrailer("</BODY>\\n</HTML>");
    }

    @Override
    public void addLine(String line) {
        report += line + "<BR>\n";
    }
}
