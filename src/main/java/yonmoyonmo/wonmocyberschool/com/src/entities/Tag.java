package yonmoyonmo.wonmocyberschool.com.src.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "table_tag")
public class Tag {

    @Column(name = "tag_key")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tagKey;

    @Column(name = "tag_name")
    private String tagName;

    @ManyToOne
    @JoinColumn(name="post_key", referencedColumnName = "post_key")
    private Post post;
    public void setPost(Post post){
        if(this.post != null){
            this.post.getTags().remove(this);
        }
        this.post = post;
        post.getTags().add(this);
    }

    @ManyToOne
    @JoinColumn(name= "category_key", referencedColumnName = "category_key")
    private Category category;
    public void setCategory(Category category){
        if(this.category != null){
            this.category.getTags().remove(this);
        }
        //FK 업데이트 : 찐으로 테이블 상에서 FK 업데이트 된다.
        this.category = category;
        //객체 관점 양방향 매핑, DB에 저장될 정보는 아님.
        category.getTags().add(this);
    }


}
