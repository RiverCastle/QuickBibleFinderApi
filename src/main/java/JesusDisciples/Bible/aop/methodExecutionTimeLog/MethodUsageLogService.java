package JesusDisciples.Bible.aop.methodExecutionTimeLog;

import JesusDisciples.Bible.api.dto.BibleFindReqDto;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class MethodUsageLogService {
    private final MethodUsageLogRepository methodUsageLogRepository;

    public void logThisMethodUsage(ProceedingJoinPoint joinPoint, StopWatch stopWatch) {
        BibleFindReqDto params = (BibleFindReqDto) joinPoint.getArgs()[0];
        String engAbbr = params.getEngAbbr();
        String verseInfo = params.getVerseInfo();
        Long processingTime = stopWatch.getTotalTimeMillis();
        LocalDateTime now = LocalDateTime.now();

        MethodUsageLogEntity entity = new MethodUsageLogEntity();
        entity.setEngAbbr(engAbbr);
        entity.setVerseInfo(verseInfo);
        entity.setProcessingTime(processingTime);
        entity.setWhenRequested(now);
        methodUsageLogRepository.save(entity);
    }
}
