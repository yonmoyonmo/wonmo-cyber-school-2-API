package yonmoyonmo.wonmocyberschool.com.src.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "table_category")
public class Category {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_key")
    private Long categoryKey;

    @ManyToOne
    @JoinColumn(name="wonmo_key", referencedColumnName = "wonmo_key")
    private Wonmo wonmo;

    public void setWonmo(Wonmo wonmo){
        if(this.wonmo != null){
            this.wonmo.getCategories().remove(this);
        }
        this.wonmo = wonmo;
        wonmo.getCategories().add(this);
    }

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(mappedBy = "category")
    private List<Post> posts = new ArrayList<>();

    @OneToMany(mappedBy = "category")
    private List<Tag> tags = new ArrayList<>();

    @OneToMany(mappedBy = "category")
    private List<Image> images = new ArrayList<>();

    @OneToMany(mappedBy = "category")
    private List<Comment> comments = new ArrayList<>();
}
