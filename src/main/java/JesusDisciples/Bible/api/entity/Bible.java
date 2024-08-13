package JesusDisciples.Bible.api.entity;

import jakarta.persistence.*;
import lombok.Getter;


@Entity
@Table(name = "bible")
public class Bible {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "book_eng")
    private String bookTitle;
    private Integer chapter;
    private Integer verse;
    private String content;
    @Column(name = "abbr_eng")
    private String engAbbr;
    @Column(name = "abbr_kor")
    private String korAbbr;

    public String getContent() {
        return content;
    }
}
