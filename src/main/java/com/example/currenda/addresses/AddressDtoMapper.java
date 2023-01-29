package com.example.currenda.addresses;

import org.springframework.stereotype.Service;

@Service
public class AddressDtoMapper {
    AddressDto map(AddressEntity addressEntity){
        AddressDto addressDto = new AddressDto();
        addressDto.setCity(addressEntity.getCity());
        addressDto.setStreet(addressEntity.getStreet());
        addressDto.setPostalCode(addressEntity.getPostalCode());
        addressDto.setPartyName(addressEntity.getPartyId().getName());
        return addressDto;
    }
}
