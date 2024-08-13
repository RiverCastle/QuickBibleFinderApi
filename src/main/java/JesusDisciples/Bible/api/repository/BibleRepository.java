package JesusDisciples.Bible.api.repository;

import JesusDisciples.Bible.api.entity.Bible;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibleRepository extends JpaRepository<Bible, Long> {
    Bible findByEngAbbrAndChapterAndVerse(String engAbbr, int chapter, int verse);
}
