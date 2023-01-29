package com.example.currenda.addresses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AddressDto {
    private String city;
    private String postalCode;
    private String street;
    private String partyName;
}
