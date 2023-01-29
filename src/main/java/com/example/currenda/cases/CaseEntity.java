package com.example.currenda.cases;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

@Entity
@Getter
public class CaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long caseId;
    private String caseNumber;
    private String caseType;
    private String caseState;
    private Date dateOfEntry;

}
