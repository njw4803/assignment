package com.leeni.sample.dto.user;

import com.leeni.sample.dto.CommonResponseDTO;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString(callSuper = true)
@Getter
public class ResponseUserDTO extends CommonResponseDTO {
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
