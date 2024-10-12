package com.leeni.sample.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@SuperBuilder
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class CommonResponseDTO {
    protected LocalDateTime createDate;
    protected String createId;
    protected LocalDateTime updateDate;
    protected String updateId;
}
