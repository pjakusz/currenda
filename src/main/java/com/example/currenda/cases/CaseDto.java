package com.example.currenda.cases;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CaseDto {
    private Long caseId;
    private String caseNumber;
    private String caseType;
    private String caseState;
    private String dateOfEntry;

}
