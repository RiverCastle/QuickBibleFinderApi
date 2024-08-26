package JesusDisciples.Bible.api.dto;

import JesusDisciples.Bible.aop.methodExecutionTimeLog.MethodUsageLogEntity;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MethodUsageLogDto {
    private String engAbbr;
    private String verseInfo;
    private LocalDateTime whenRequested;
    private Long processingTime;

    public static MethodUsageLogDto fromEntity(MethodUsageLogEntity entity) {
        MethodUsageLogDto dto = new MethodUsageLogDto();
        dto.setEngAbbr(entity.getEngAbbr());
        dto.setVerseInfo(entity.getVerseInfo());
        dto.setWhenRequested(entity.getWhenRequested());
        dto.setProcessingTime(entity.getProcessingTime());

        return dto;
    }
}
