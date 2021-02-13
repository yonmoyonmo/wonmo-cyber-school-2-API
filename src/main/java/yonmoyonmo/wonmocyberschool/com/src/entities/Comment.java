package yonmoyonmo.wonmocyberschool.com.src.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "table_comment")
public class Comment {

    @Column(name = "comment_key")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentKey;

    @Column(name = "comment_content")
    private String commentContent;

    @ManyToOne
    @JoinColumn(name="post_key", referencedColumnName = "post_key")
    private Post post;
    public void setPost(Post post){
        if(this.post != null){
            this.post.getComments().remove(this);
        }
        this.post = post;
        post.getComments().add(this);
    }

    @ManyToOne
    @JoinColumn(name= "category_key", referencedColumnName = "category_key")
    private Category category;
    public void setCategory(Category category){
        if(this.category != null){
            this.category.getComments().remove(this);
        }
        this.category = category;
        category.getComments().add(this);
    }
    //작성자 wonmo || not wonmo
    @ManyToOne
    @JoinColumn(name ="wonmo_key", referencedColumnName = "wonmo_key")
    private Wonmo wonmo;
    public void setWonmo(Wonmo wonmo){
        if(this.wonmo!=null){
            this.wonmo.getComments().remove(this);
        }
        this.wonmo = wonmo;
        wonmo.getComments().add(this);
    }

    @ManyToOne
    @JoinColumn(name ="not_wonmo_key", referencedColumnName = "not_wonmo_key")
    private NotWonmo notWonmo;
    public void setNotWonmo(NotWonmo notWonmo){
        if(this.notWonmo!=null){
            this.notWonmo.getComments().remove(this);
        }
        this.notWonmo = notWonmo;
        notWonmo.getComments().add(this);
    }
}
