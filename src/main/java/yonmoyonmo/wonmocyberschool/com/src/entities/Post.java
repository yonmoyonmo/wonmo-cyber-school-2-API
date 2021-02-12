package yonmoyonmo.wonmocyberschool.com.src.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "table_post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="post_key")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "reg_dt")
    private String regDt;

    @Column(name = "mod_dt")
    private String modDt;

}
