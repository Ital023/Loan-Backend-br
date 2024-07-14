package io.github.ital023.loans.controller.dto;

import io.github.ital023.loans.domain.enums.LoanType;

public record LoanDTO(LoanType loanType, Double interestRate) {
}
