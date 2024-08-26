package JesusDisciples.Bible.api.service;

import JesusDisciples.Bible.aop.methodExecutionTimeLog.MethodUsageLogEntity;
import JesusDisciples.Bible.aop.methodExecutionTimeLog.MethodUsageLogRepository;
import JesusDisciples.Bible.api.dto.MethodUsageLogDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MethodUsageLogReader {
    private final MethodUsageLogRepository methodUsageLogRepository;
    public Long getAvgProcessTime() {
        PageRequest pageRequest = PageRequest.of(0, 30);
        return methodUsageLogRepository.findAverageProcessingTime(pageRequest);
    }

    public MethodUsageLogDto[] getNumberMethodUsageLogsDto(Integer logNumbers) {
        MethodUsageLogDto[] results = new MethodUsageLogDto[logNumbers];
        PageRequest pageRequest = PageRequest.of(0, logNumbers);

        Page<MethodUsageLogEntity> entityPage = methodUsageLogRepository.findAllByOrderByWhenRequestedDesc(pageRequest);
        int i = 0;
        for (MethodUsageLogEntity entity : entityPage) {
            results[i] = MethodUsageLogDto.fromEntity(entity);
            i++;
        }

        return results;
    }
}
