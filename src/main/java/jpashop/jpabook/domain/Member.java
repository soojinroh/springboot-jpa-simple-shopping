package jpashop.jpabook.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member")
    // order table에 있는 member 필드에 의해 매핑되었다는 뜻.
    // 주인이 아닌 거울이 된다.
    // 읽기 전용. order를 변경해도 반영되지 않는다.
    // 필드에서 바로 초기화해주는 게 Best Practice
    private List<Order> orders = new ArrayList<>();
}
