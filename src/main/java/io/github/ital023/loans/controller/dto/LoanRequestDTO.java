package io.github.ital023.loans.controller.dto;

public record LoanRequestDTO(Integer age, String cpf, String nome, Double income, String location) {
}
