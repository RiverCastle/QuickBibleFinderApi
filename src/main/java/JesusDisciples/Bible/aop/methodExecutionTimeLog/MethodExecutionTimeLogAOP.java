package JesusDisciples.Bible.aop.methodExecutionTimeLog;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Slf4j
@Aspect
@Component
@RequiredArgsConstructor
public class MethodExecutionTimeLogAOP {
    private final MethodUsageLogService methodUsageLogService;

    @Pointcut("@annotation(JesusDisciples.Bible.aop.methodExecutionTimeLog.MethodExecutionTimeLogTarget)")
    private void enableTimer() {
    }

    @Around("enableTimer()")
    public Object LogProcessingTime(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object result = joinPoint.proceed();

        stopWatch.stop();

        methodUsageLogService.logThisMethodUsage(joinPoint, stopWatch);
        return result;
    }
}
