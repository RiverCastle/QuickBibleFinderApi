package JesusDisciples.Bible.api.dto;

import lombok.Data;

@Data
public class BibleFindReqDto {
    private String engAbbr;
    private String verseInfo;

    public String getEngAbbr() {
        return engAbbr;
    }

    public String getVerseInfo() {
        return verseInfo;
    }
}