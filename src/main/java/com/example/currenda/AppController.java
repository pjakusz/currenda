package com.example.currenda;

import com.example.currenda.addresses.AddressDto;
import com.example.currenda.addresses.AddressService;
import com.example.currenda.cases.CaseDto;
import com.example.currenda.cases.CaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cases")
public class AppController {
    private final CaseService caseService;
    private final AddressService addressService;

    public AppController(CaseService caseService, AddressService addressService) {
        this.caseService = caseService;
        this.addressService = addressService;
    }

    @GetMapping
    ResponseEntity<List<CaseDto>> getCases(@RequestParam String type, @RequestParam String startDate, @RequestParam String endDate){
        if (caseService.getCases(type,startDate, endDate).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(caseService.getCases(type, startDate, endDate));
    }

    @GetMapping("/addresses")
    ResponseEntity<List<AddressDto>> getAddresses(@RequestParam String state){
        if (addressService.getAddresses(state).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(addressService.getAddresses(state));
    }

}
