package yonmoyonmo.wonmocyberschool.com.src.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import yonmoyonmo.wonmocyberschool.com.src.entities.Image;
import yonmoyonmo.wonmocyberschool.com.src.entities.Post;

public interface JpaImageRepository extends JpaRepository<Image, Long> {
}
