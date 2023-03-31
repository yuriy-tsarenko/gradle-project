package com.goit.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CurrencyDto {
    private String currency;
    private Double value;
}
