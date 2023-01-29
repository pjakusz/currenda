package com.example.currenda.addresses;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressRepository extends CrudRepository<AddressEntity, Long> {

    @Query(value= """
                SELECT a.* FROM address_entity a
                JOIN party_entity p ON p.party_id = a.party_id AND p.active = TRUE
                JOIN case_entity c ON c.case_id = p.case_id AND c.case_state = UPPER(:state) 
                """, nativeQuery = true)
    List<AddressEntity> findAllActiveByState(String state);
}
