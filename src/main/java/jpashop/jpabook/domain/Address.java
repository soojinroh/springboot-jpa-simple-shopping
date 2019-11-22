package jpashop.jpabook.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    // JPA에서 Reflection을 이용해서 생성해야 하기 때문에 기본 생성자가 필요
    protected Address() {
    }

    // 생성자로만 값을 할당할 수 있기 때문에 불변을 보장할 수 있다.
    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
