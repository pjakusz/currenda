package com.example.currenda.cases;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class CaseDtoMapper {
    CaseDto map(CaseEntity caseEntity){
        CaseDto caseDto = new CaseDto();
        caseDto.setCaseId(caseEntity.getCaseId());
        caseDto.setCaseState(caseEntity.getCaseState());
        caseDto.setCaseNumber(caseEntity.getCaseNumber());
        caseDto.setCaseType(caseEntity.getCaseType());
        caseDto.setDateOfEntry(new SimpleDateFormat("yyyy-MM-dd").format(caseEntity.getDateOfEntry()));
        return caseDto;
    }
}
