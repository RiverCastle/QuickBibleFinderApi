package JesusDisciples.Bible.api.dto;

import lombok.Data;

@Data
public class BibleApiResult {
    private String title;
    private String chapter;
    private String verse;
    private String message;

    public BibleApiResult(String title, String chapter, String verse, String message) {
        this.title = title;
        this.chapter = chapter;
        this.verse = verse;
        this.message = message;
    }
}
