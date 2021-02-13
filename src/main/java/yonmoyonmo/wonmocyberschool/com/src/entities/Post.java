package yonmoyonmo.wonmocyberschool.com.src.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "table_post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="post_key")
    private Long postKey;

    @ManyToOne
    @JoinColumn(name = "category_key", referencedColumnName = "category_key")
    private Category category;
    public void setCategory(Category category){
        if(this.category != null){
            //post 당 카테고리는 1개만 유지
            //새 set이 일어날 양방향 매핑 된 Category의 posts에서 이전에 등록된 post정보를 삭제함.
            this.category.getPosts().remove(this);
        }
        //FK 업데이트 : 찐으로 테이블 상에서 FK 업데이트 된다.
        this.category = category;
        //객체 관점 양방향 매핑, DB에 저장될 정보는 아님.
        category.getPosts().add(this);
    }

    @ManyToOne
    @JoinColumn(name = "wonmo_key", referencedColumnName = "wonmo_key")
    private Wonmo wonmo;
    public void setWonmo(Wonmo wonmo){
        if(this.wonmo != null){
            this.wonmo.getPosts().remove(this);
        }
        //FK 업데이트 : 찐으로 테이블 상에서 FK 업데이트 된다.
        this.wonmo = wonmo;
        //객체 관점 양방향 매핑, DB에 저장될 정보는 아님.
        wonmo.getPosts().add(this);
    }

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "reg_dt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date regDt;

    @Column(name = "mod_dt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modDt;

    @OneToMany(mappedBy = "post")
    private List<Tag> tags = new ArrayList<>();

    @OneToMany(mappedBy = "post")
    private List<Image> images = new ArrayList<>();

    @OneToMany(mappedBy = "post")
    private List<Comment> comments = new ArrayList<>();
}
