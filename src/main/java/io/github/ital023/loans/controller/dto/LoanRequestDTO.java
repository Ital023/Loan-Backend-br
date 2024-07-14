package io.github.ital023.loans.controller.dto;

import io.github.ital023.loans.domain.Customer;

public record LoanRequestDTO(Integer age, String cpf, String name, Double income, String location) {

    public Customer toCustomer(){
        return new Customer(age,cpf,name,income,location);
    }

}
