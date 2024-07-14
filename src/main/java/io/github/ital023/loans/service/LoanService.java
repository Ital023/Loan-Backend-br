package io.github.ital023.loans.service;

import io.github.ital023.loans.controller.dto.LoanDTO;
import io.github.ital023.loans.controller.dto.LoanRequestDTO;
import io.github.ital023.loans.controller.dto.LoanResponseDTO;
import io.github.ital023.loans.domain.Customer;
import io.github.ital023.loans.domain.Loan;
import io.github.ital023.loans.domain.enums.LoanType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    public LoanResponseDTO loanAvaibles(LoanRequestDTO loanRequestDTO){
        Customer customer = loanRequestDTO.toCustomer();
        Loan loan = new Loan(customer);

        List<LoanDTO> loans = new ArrayList<>();

        if(loan.isPersonalLoanAvailable()){
            loans.add(new LoanDTO(LoanType.PERSONAL,loan.getPersonalLoanInterestedRate()));
        }

        return new LoanResponseDTO(loanRequestDTO.name(), loans);
    }


}
