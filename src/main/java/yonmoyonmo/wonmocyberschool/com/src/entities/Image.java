package yonmoyonmo.wonmocyberschool.com.src.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "table_image")
public class Image {

    @Column(name = "image_key")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imageKey;

    @Column(name = "image_path")
    private String imagePath;

    @Column(name = "reg_dt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date regDt;

    @ManyToOne
    @JoinColumn(name="post_key", referencedColumnName = "post_key")
    private Post post;
    public void setPost(Post post){
        if(this.post != null){
            this.post.getImages().remove(this);
        }
        this.post = post;
        post.getImages().add(this);
    }

    @ManyToOne
    @JoinColumn(name= "category_key", referencedColumnName = "category_key")
    private Category category;
    public void setCategory(Category category){
        if(this.category != null){
            this.category.getImages().remove(this);
        }
        this.category = category;
        category.getImages().add(this);
    }
}
