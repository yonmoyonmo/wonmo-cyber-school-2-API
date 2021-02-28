package yonmoyonmo.wonmocyberschool.com.src.entities;

import javax.persistence.*;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

//원모 : 어드민임

@Data
@Entity
@Table(name="table_wonmo")
public class Wonmo {

    @Column(name = "wonmo_key")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wonmoKey;

    @Column(name = "wonmo_id")
    private String wonmoId;

    @Column(name = "wonmo_password")
    private String wonmoPassword;

    @OneToMany(mappedBy = "wonmo")
    private List<Post> posts = new ArrayList<>();

    @OneToMany(mappedBy = "wonmo")
    private List<Category> categories = new ArrayList<>();

    @OneToMany(mappedBy = "wonmo")
    private List<Comment> comments = new ArrayList<>();

}
