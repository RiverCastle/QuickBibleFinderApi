package JesusDisciples.Bible.api.service;

import JesusDisciples.Bible.api.dto.BibleApiResult;
import JesusDisciples.Bible.api.dto.BibleFindReqDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BibleFindServiceV1 {

    public BibleApiResult[] getThisVerses(BibleFindReqDto bibleFindReqDto) {
        String title = bibleFindReqDto.getEngAbbr();
        String verseInfo = bibleFindReqDto.getVerseInfo();
        String url = "https://yesu.io/bible?lang=kor"
                + "&doc=" + title
                + "&start=" + verseInfo
                + "&end=" + verseInfo;
        // url format = https://yesu.io/bible?lang=kor&doc=제목&start=시작장:시작절&end=끝장:끝절

        BibleApiResult[] result =  new RestTemplate().getForObject(url, BibleApiResult[].class);
        result[0].setEngTitle(title);
        return result;

    }
}