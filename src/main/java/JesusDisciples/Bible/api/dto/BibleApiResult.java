package JesusDisciples.Bible.api.dto;

import JesusDisciples.Bible.api.entity.Bible;
import lombok.Data;

@Data
public class BibleApiResult {
    private String korAbbr;
    private String engAbbr;

    private String korTitle;
    private String engTitle;

    private Integer chapter;
    private Integer verse;
    private String content;

    public static BibleApiResult fromEntity(Bible entity) {
        BibleApiResult result = new BibleApiResult();
        result.setKorTitle(entity.getKorTitle());
        result.setEngTitle(entity.getEngTitle());
        result.setKorAbbr(entity.getKorAbbr());
        result.setEngAbbr(entity.getEngAbbr());
        result.setChapter(entity.getChapter());
        result.setVerse(entity.getVerse());
        result.setContent(entity.getContent());

        return result;
    }

    public void setKorAbbr(String korAbbr) {
        this.korAbbr = korAbbr;
    }

    public void setEngAbbr(String engAbbr) {
        this.engAbbr = engAbbr;
    }

    public void setKorTitle(String korTitle) {
        this.korTitle = korTitle;
    }

    public void setEngTitle(String engTitle) {
        this.engTitle = engTitle;
    }

    public void setChapter(Integer chapter) {
        this.chapter = chapter;
    }

    public void setVerse(Integer verse) {
        this.verse = verse;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
