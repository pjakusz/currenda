package com.example.currenda.cases;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseService {
    private final CaseRepository caseRepository;
    private final CaseDtoMapper caseDtoMapper;

    public CaseService(CaseRepository caseRepository, CaseDtoMapper caseDtoMapper) {
        this.caseRepository = caseRepository;
        this.caseDtoMapper = caseDtoMapper;
    }

    public List<CaseDto> getCases(String type, String startDate, String endDate){
        return caseRepository.findAllCasesByTypeAndDates(type,startDate,endDate)
                .stream()
                .map(caseDtoMapper::map)
                .toList();
    }
}
