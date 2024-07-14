package io.github.ital023.loans.controller.dto;

import java.util.List;

public record LoanResponseDTO(String customer, List<LoanDTO> loans) {
}
