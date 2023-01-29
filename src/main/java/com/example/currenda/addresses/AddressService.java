package com.example.currenda.addresses;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    public final AddressRepository addressRepository;
    public final AddressDtoMapper addressDtoMapper;

    public AddressService(AddressRepository addressRepository, AddressDtoMapper addressDtoMapper) {
        this.addressRepository = addressRepository;
        this.addressDtoMapper = addressDtoMapper;
    }

    public List<AddressDto> getAddresses(String state){
        return addressRepository.findAllActiveByState(state)
                .stream()
                .map(addressDtoMapper::map)
                .toList();
    }
}
