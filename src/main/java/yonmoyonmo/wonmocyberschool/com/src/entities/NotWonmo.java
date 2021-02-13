package yonmoyonmo.wonmocyberschool.com.src.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


//원모가 아닌 유저
//인증 방식 아직 안정함
//Oauth2.0으로 할 것 같음
//오직 댓글만 생성/수정 가능한 존재

@Data
@Entity
@Table(name = "table_not_wonmo")
public class NotWonmo {

    @Column(name = "not_wonmo_key")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notWonmoKey;

    @Column(name = "not_wonmo_password")
    private String notWonmoPassword;

    @OneToMany(mappedBy = "notWonmo")
    private List<Comment> comments = new ArrayList<>();
}
