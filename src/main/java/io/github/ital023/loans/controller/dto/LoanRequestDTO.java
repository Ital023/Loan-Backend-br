package io.github.ital023.loans.controller.dto;

import io.github.ital023.loans.domain.Customer;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

public record LoanRequestDTO(@Min(value = 18) @NotNull Integer age, @CPF String cpf, @NotBlank String name, @NotNull @Min(value = 1000) Double income, @NotBlank String location) {

    public Customer toCustomer(){
        return new Customer(age,cpf,name,income,location);
    }

}
