package yonmoyonmo.wonmocyberschool.com.src.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "table_category")
public class Category {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_key")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;
}
