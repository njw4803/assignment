package com.leeni.sample.dto.user;

import com.leeni.sample.dto.CommonRequestDTO;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
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
