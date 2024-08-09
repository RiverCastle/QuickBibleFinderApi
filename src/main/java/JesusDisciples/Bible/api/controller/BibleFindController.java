package JesusDisciples.Bible.api.controller;

import JesusDisciples.Bible.api.dto.BibleApiResult;
import JesusDisciples.Bible.api.dto.BibleFindReqDto;
import JesusDisciples.Bible.api.service.BibleFindServiceV2;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/{title}/{verseInfo}")
public class BibleFindController {
    4private final BibleFindServiceV2 bibleFindService;

    @GetMapping
    private BibleApiResult[] getBibleVerses(@PathVariable("title") String title,
                                            @PathVariable("verseInfo") String verseInfo) {
        BibleFindReqDto bibleFindReqDto = new BibleFindReqDto();
        bibleFindReqDto.setTitle(title);
        bibleFindReqDto.setVerseInfo(verseInfo);

        return bibleFindService.getThisVerses(bibleFindReqDto);
    }
}
