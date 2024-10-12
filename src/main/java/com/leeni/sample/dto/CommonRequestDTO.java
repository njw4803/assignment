package com.leeni.sample.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommonRequestDTO {
}
