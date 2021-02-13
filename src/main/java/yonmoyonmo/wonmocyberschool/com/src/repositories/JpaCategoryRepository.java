package yonmoyonmo.wonmocyberschool.com.src.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import yonmoyonmo.wonmocyberschool.com.src.entities.Category;

import java.util.List;

public interface JpaCategoryRepository extends JpaRepository<Category, Long> {
    public Category findByCategoryName(String categoryName);
}
