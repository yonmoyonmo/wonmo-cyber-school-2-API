package yonmoyonmo.wonmocyberschool.com.src.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import yonmoyonmo.wonmocyberschool.com.src.entities.Category;
import yonmoyonmo.wonmocyberschool.com.src.entities.Post;

public interface JpaPostRepository extends JpaRepository<Post, Long> {
}
