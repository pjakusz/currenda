package com.example.currenda.party;

import com.example.currenda.cases.CaseEntity;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class PartyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long partyId;
    @ManyToOne
    @JoinColumn(name="caseId")
    private CaseEntity caseId;
    private String partyType;
    private String name;
    private boolean active;

}
