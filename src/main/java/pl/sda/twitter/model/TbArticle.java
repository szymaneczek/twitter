package pl.sda.twitter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_ARTICLE", catalog = "TcS9JJQYWv")
public class TbArticle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AR_ID", nullable = false, unique = true)

    private int articleId;
    @Setter
    @OneToOne
    @JoinColumn(name = "AR_USER_ID", nullable = false)

    private TbUser user;
    @Setter
    @Column(name = "AR_CONTENT", length = 1000)
    private String content;

}
