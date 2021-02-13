package yonmoyonmo.wonmocyberschool.com.src.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import yonmoyonmo.wonmocyberschool.com.src.entities.Comment;
import yonmoyonmo.wonmocyberschool.com.src.entities.Post;

public interface JpaCommentRepository extends JpaRepository<Comment, Long> {
}
