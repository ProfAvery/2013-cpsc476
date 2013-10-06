package com.example.greetings;

public class HtmlGreeter implements IGreeter {
    private String tag;
    private String greeting;

    public HtmlGreeter(String tag, String greeting) {
        this.tag = tag;
        this.greeting = greeting;
    }

    private String htmlTag(String tag, String text) {
        StringBuilder sb = new StringBuilder();

        sb.append('<');
        sb.append(tag);
        sb.append('>');
        sb.append(text);
        sb.append("</");
        sb.append(tag);
        sb.append('>');

        return sb.toString();
    }

    public String greet() {
        return htmlTag(tag, greeting);
    }

}
