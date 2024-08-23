package JesusDisciples.Bible.api.service;

import JesusDisciples.Bible.api.dto.BibleApiResult;
import JesusDisciples.Bible.api.dto.BibleFindReqDto;
import JesusDisciples.Bible.api.entity.Bible;
import JesusDisciples.Bible.api.repository.BibleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BibleFindServiceV2 {

    private final BibleRepository bibleRepository;
    public BibleApiResult[] getThisVerses(BibleFindReqDto bibleFindReqDto) {
        String engAbbr = bibleFindReqDto.getEngAbbr();
        String[] verseInfo = bibleFindReqDto.getVerseInfo().split(":");
        int chapter = Integer.parseInt(verseInfo[0]);
        int targetVerse = Integer.parseInt(verseInfo[1]);

        Bible entity = bibleRepository.findByEngAbbrAndChapterAndVerse(engAbbr, chapter, targetVerse);
        BibleApiResult[] result = new BibleApiResult[1];
        result[0] = BibleApiResult.fromEntity(entity);

        return result;
    }
}