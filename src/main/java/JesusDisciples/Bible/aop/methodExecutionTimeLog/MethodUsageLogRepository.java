package JesusDisciples.Bible.aop.methodExecutionTimeLog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MethodUsageLogRepository extends JpaRepository<MethodUsageLogEntity, Long> {
}
