package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Getter
@Setter
@Entity
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;    private Address address;


    @OneToOne(mappedBy = "delivery", fetch = LAZY)
    private Order order;

    @Embedded

    @Enumerated(EnumType.STRING) // default는 Ordinal인데 숫자로 값이 들어감.
    private DeliveryStatus status; // READY, COP
}

