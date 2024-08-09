package JesusDisciples.Bible.api.dto;

import lombok.Data;

@Data
public class BibleApiResult {
    private String title;
    private String chapter;
    private String verse;
    private String message;
}
