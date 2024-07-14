package io.github.ital023.loans.factory;

import io.github.ital023.loans.domain.Customer;

public class CustomerFactory {

    public static Customer build() {
        return new Customer(25,"123.456.789-00","Name", 5000.00,"SP");
    }

    public static Customer build(Double income) {
        return new Customer(25,"123.456.789-00","Name", income,"SP");
    }

}
