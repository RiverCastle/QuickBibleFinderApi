package JesusDisciples.Bible.api.controller;

import JesusDisciples.Bible.api.dto.MethodUsageLogDto;
import JesusDisciples.Bible.api.service.MethodUsageLogReader;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/log")
public class ServiceLogController {
    private final MethodUsageLogReader methodUsageLogReader;

    @GetMapping("/average-processing-time")
    @CrossOrigin(origins = "*", methods = RequestMethod.GET)
    public Long getAvgProcessTime() {
        return methodUsageLogReader.getAvgProcessTime();
    }

    @GetMapping("/{logsNumber}")
    @CrossOrigin(origins = "*", methods = RequestMethod.GET)
    public MethodUsageLogDto[] getNumberMethodUsageLogsDto(@PathVariable(value = "logsNumber") Integer logNumbers) {
        return methodUsageLogReader.getNumberMethodUsageLogsDto(logNumbers);
    }
}
