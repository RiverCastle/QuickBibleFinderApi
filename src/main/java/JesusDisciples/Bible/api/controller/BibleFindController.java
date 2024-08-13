package JesusDisciples.Bible.api.controller;

import JesusDisciples.Bible.api.dto.BibleApiResult;
import JesusDisciples.Bible.api.dto.BibleFindReqDto;
import JesusDisciples.Bible.api.service.BibleFindServiceV2;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/{title}/{verseInfo}")
public class BibleFindController {
    private final BibleFindServiceV2 bibleFindService;

    @GetMapping
    @CrossOrigin(origins = "*", methods = RequestMethod.GET)
    private BibleApiResult[] getBibleVerses(@PathVariable("title") String engAbbr,
                                            @PathVariable("verseInfo") String verseInfo) {
        BibleFindReqDto bibleFindReqDto = new BibleFindReqDto();
        bibleFindReqDto.setEngAbbr(engAbbr);
        bibleFindReqDto.setVerseInfo(verseInfo);

        return bibleFindService.getThisVerses(bibleFindReqDto);
    }
}
