package com.leeni.sample.dto.user;

import com.leeni.sample.dto.CommonRequestDTO;
import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE) // @SuperBuilder로 인해 자동으로 기본생성자가 만들어지지 않아 추가
@Getter // @RequestBody는 기본생성자로 인스턴스(객체)를 생성하고 setter 또는 getter를 통해 feild 정보를 추출하여 값을 넣어줌
// @ModelAttribute는 파라미터 개수가 0개인 기본 생성자가 확인되면 우선 인스턴스(객체)를 생성하고, setter 메서드를 통한 바인딩을 시도한다.
// 그렇지 않을 경우 필드에 맞는 파라미터를 가진 생성자를 찾아 바인딩을 시도한다.
public class RequestUserDTO extends CommonRequestDTO {
    private int idx;
    private String id;
    private String password;
    private String name;
    private String phone;
    private int zipCode;
    private String address;
    private String detailedAddress;
    private Byte profileImage;
    private String authority;
    private String locked;

}
