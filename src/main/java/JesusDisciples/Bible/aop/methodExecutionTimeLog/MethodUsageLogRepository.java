package JesusDisciples.Bible.aop.methodExecutionTimeLog;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MethodUsageLogRepository
        extends JpaRepository<MethodUsageLogEntity, Long> {
    @Query("SELECT AVG(m.processingTime) FROM MethodUsageLogEntity m ORDER BY m.whenRequested DESC")
    Long findAverageProcessingTime(PageRequest pageRequest);

    Page<MethodUsageLogEntity> findAllByOrderByWhenRequestedDesc(Pageable pageable);
}
