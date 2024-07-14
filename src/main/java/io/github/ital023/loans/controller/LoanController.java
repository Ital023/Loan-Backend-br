package io.github.ital023.loans.controller;

import io.github.ital023.loans.controller.dto.LoanRequestDTO;
import io.github.ital023.loans.controller.dto.LoanResponseDTO;
import io.github.ital023.loans.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping("/customer-loans")
    public ResponseEntity<LoanResponseDTO> customerLoans(@RequestBody LoanRequestDTO loanRequestDTO){
        return null;
    }

}
