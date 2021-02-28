package yonmoyonmo.wonmocyberschool.com.src.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import yonmoyonmo.wonmocyberschool.com.src.entities.Wonmo;

public interface JpaWonmoRepository extends JpaRepository<Wonmo, Long> {
}
