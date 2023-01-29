package com.example.currenda.cases;

import com.example.currenda.cases.CaseEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CaseRepository extends CrudRepository<CaseEntity, Long> {

    @Query(value="""
            SELECT c.* FROM case_entity c
            WHERE c.case_type = UPPER(:type) 
            AND c.date_of_entry BETWEEN :startDate and :endDate
            ORDER BY c.case_state, c.case_id
            """, nativeQuery = true)
    List<CaseEntity> findAllCasesByTypeAndDates(String type,String startDate,String endDate);
}
