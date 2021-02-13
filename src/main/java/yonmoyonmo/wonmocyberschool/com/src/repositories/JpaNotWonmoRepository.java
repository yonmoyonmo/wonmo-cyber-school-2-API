package yonmoyonmo.wonmocyberschool.com.src.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import yonmoyonmo.wonmocyberschool.com.src.entities.NotWonmo;
import yonmoyonmo.wonmocyberschool.com.src.entities.Post;

public interface JpaNotWonmoRepository extends JpaRepository<NotWonmo, Long> {
}
