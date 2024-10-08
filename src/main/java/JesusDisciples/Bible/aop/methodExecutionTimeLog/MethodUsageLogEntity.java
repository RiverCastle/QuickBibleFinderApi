package JesusDisciples.Bible.aop.methodExecutionTimeLog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class MethodUsageLogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String engAbbr;
    private String verseInfo;
    private LocalDateTime whenRequested;
    private Long processingTime;
}
