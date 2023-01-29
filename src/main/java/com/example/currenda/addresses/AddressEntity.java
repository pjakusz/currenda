package com.example.currenda.addresses;

import com.example.currenda.party.PartyEntity;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private Long id;
    private String city;
    private String postalCode;
    private String street;
    @ManyToOne
    @JoinColumn(name="partyId")
    private PartyEntity partyId;

}
