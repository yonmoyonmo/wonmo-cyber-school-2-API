package yonmoyonmo.wonmocyberschool.com.src.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import yonmoyonmo.wonmocyberschool.com.src.entities.Tag;

public interface JpaTagRepository extends JpaRepository<Tag, Long> {
}
