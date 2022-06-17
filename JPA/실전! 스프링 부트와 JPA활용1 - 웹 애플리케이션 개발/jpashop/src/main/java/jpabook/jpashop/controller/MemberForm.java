package jpabook.jpashop.controller;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter @Setter
public class MemberForm {

    @NotEmpty(message = "이름은 필수 값입니다.")
    private String name;

    private String city;
    private String street;
    private String zipcode;
}
