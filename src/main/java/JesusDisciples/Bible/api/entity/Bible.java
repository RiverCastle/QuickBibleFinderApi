package JesusDisciples.Bible.api.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "bible")
public class Bible {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "book_eng")
    private String engTitle;
    @Column(name = "book_kor")
    private String korTitle;
    private Integer chapter;
    private Integer verse;
    private String content;
    @Column(name = "abbr_eng")
    private String engAbbr;
    @Column(name = "abbr_kor")
    private String korAbbr;


    public String getEngTitle() {
        return engTitle;
    }

    public String getKorTitle() {
        return korTitle;
    }

    public Integer getChapter() {
        return chapter;
    }

    public String getContent() {
        return content;
    }

    public String getEngAbbr() {
        return engAbbr;
    }

    public String getKorAbbr() {
        return korAbbr;
    }

    public Integer getVerse() {
        return verse;
    }
}
