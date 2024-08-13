package JesusDisciples.Bible.api.dto;

import lombok.Data;

@Data
public class BibleApiResult {
    private String korAbbr;
    private String engAbbr;

    private String korTitle;
    private String engTitle;

    private String chapter;
    private String verse;
    private String content;

    public BibleApiResult(String engAbbr, String chapter, String verse, String content) {
        this.engAbbr = engAbbr;
        this.chapter = chapter;
        this.verse = verse;
        this.content = content;
    }
}
